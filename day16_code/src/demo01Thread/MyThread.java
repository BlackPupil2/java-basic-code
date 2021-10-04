package demo01Thread;
/*获取线程的名称*/
public class MyThread extends Thread {
    @Override
    public void run() {
      //  String name = getName();
     //   System.out.println(name);
      /*  Thread t = Thread.currentThread();
        System.out.println(t);*/
        System.out.println( Thread.currentThread().getName());

    }
}
