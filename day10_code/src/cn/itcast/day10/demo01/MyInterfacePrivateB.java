package cn.itcast.day10.demo01;

public interface MyInterfacePrivateB {
    public static void methodDefault1(){
        System.out.println("默认方法1");
      methodStaticCommon();

    }
    public static void methodDefault2(){
        System.out.println("默认方法2");
        methodStaticCommon();
    }

    private static void methodStaticCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
    }
}
