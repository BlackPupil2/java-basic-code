package cn.itcast.day07.demo04;
/*对象数组
* 定义一个数组来存储三个person对象*/
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array=new Person[3];
        Person one =new Person("asd",18);
        Person two =new Person("wwww",11);
        Person three =new Person("asdasd",11);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[2].getAge());


    }
}
