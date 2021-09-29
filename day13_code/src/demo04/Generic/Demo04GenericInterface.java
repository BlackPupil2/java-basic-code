package demo04.Generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("ss");
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2();
        gi2.method(2);
        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2();
        gi3.method(3.3);
    }
}
