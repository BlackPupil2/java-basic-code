package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(32) + 1;
            list.add(num);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }

    }
}
