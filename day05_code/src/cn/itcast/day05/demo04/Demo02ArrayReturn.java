package cn.itcast.day05.demo04;
/*返回值只有一个或者0个
* 如果希望返回多个值
* 使用数组作为返回值类型*/
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        System.out.println("总和:"+cal(1,2,3)[0]);
    }
    public static int[] cal(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        int[] array=new int[2];
        array[0]=sum;
        array[1]=avg;
        return array;
    }
}
