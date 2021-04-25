package cn.itcast.day04.demo02;
/*修饰符 返回值类型 方法名称（参数类型 参数名称，...
* 方法体
* return 返回值
* public static现阶段修饰符*/
public class Demo02MethodDefine {
    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println("============");

        //赋值调用
        int number=sum(15,25);
        System.out.println(number);
    }

    public static int sum(int a, int b) {
        System.out.println("方法执行了");
        int result = a + b;
        return result;
    }


}
