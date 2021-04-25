package cn.itcast.day05.demo03;
/*所有的引用类型变量都可以赋值为NUll*/
/*数组必须new初始化才能使用其中的元素
* 如果只赋值null，不new
* 会发生空指针异常*/
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array=null;
//        array=new int[3];
        System.out.println(array[0]);
    }
}
