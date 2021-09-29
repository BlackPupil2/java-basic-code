package demo04.Generic;

public class GenericInterfaceImpl2<I> implements GenericInterface<I> {


    @Override
    public void method(I integer) {
        System.out.println(integer);
    }
}
