package cn.itcast.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {1, 5, 15, 111, 11111};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
