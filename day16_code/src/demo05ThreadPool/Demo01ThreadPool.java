package demo05ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
    }
}
