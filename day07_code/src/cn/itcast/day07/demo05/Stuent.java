package cn.itcast.day07.demo05;

public class Stuent {
    private String name;
    private int age;

    public Stuent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Stuent() {
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
