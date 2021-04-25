package cn.itcast.day05.demo04;

/*传递进去的是数组的地址值*/
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println(array); //地址值
        printArray(array);   //aaray的地址值
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
