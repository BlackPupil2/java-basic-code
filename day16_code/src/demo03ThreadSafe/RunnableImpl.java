package demo03ThreadSafe;

public class RunnableImpl implements Runnable {
    private  int ticket=100;
    Object obj=new Object();
    @Override
    public void run() {
        System.out.println("this:"+this);
        while (true){
          synchronized (obj){
             payTicket();
          }
        }

    }
    public /*synchronized*/ void payTicket(){
        synchronized (this){
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
        }

    }
}
