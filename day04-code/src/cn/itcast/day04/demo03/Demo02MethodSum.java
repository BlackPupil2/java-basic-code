package cn.itcast.day04.demo03;

/*题目要求:
求出1到100之间的和
* */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
