package demo04WaitAndNotify;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }
    @Override
    public void run() {
        //使用死循环
        while (true){
            synchronized (bz){
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("吃货正在吃"+ bz.pi+ bz.xian+"包子");
                bz.flag=false;
                bz.notify();
                System.out.println("吃货已经吃完"+ bz.pi+ bz.xian+"包子,包子铺开始生产包子");
                System.out.println("-------------------------");
            }
        }
    }
}
