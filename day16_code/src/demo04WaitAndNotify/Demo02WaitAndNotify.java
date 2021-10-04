package demo04WaitAndNotify;

public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子和数量");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了，开吃");
                        System.out.println("--------------");
                    }
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子和数量");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了，开吃");
                        System.out.println("--------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                            try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                            synchronized (obj){
                                System.out.println("老板5秒钟之后做好包子");
                                obj.notifyAll();
                            }

                    }
                }
            }
        }.start();
    }

}
