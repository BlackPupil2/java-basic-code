package demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  /*  @Override
    public String toString() {
       // return "abc";
      //  return "Person{name="+name+",age="+age+"}";
    }
*/

 /*   @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
/*equals要重写，比较地址值没有意义
* 隐含一个多态
* Object obj=p2=new Person{"",11}
* 多态弊端:无法使用子类特有的内容
* 解决：向下转型*/

/*    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return false;
        }
        *//*增加一个判断，防止转换异常*//*
        //向下转型
        if(obj==null){
return false;        }
        if(obj instanceof  Person){
            Person p=(Person)obj;
            boolean b=  this.name.equals(p.name)&&this.age==p.age;
            return b;
        }
//        不是就返回false
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
