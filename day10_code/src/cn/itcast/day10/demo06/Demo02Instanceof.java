package cn.itcast.day10.demo06;
/*如何才能知道父类引用的对象，本来是什么子类*/
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal a1=new Cat();
        a1.eat();

        if(a1 instanceof Dog){
            Dog dog=(Dog) a1;
            dog.watchhouse();
        }
        if(a1 instanceof Cat){
            Cat cat=(Cat) a1;
            cat.eat();
        }
    }
}
