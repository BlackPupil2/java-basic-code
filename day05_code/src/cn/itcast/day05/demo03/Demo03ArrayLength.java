package cn.itcast.day05.demo03;

/*数组一旦创建，程序运行期间，长度不可改变*/
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayBB = {15, 23, 222, 333, 2};
        int len = arrayBB.length;
        System.out.println("数组的长度：" + len);
        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);

    }
}
