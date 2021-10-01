package demo01Exception;

import java.util.Objects;

public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj) {
       /* if(obj==null){
            throw new  NullPointerException("空");
        }*/
      //  Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"空");
    }
}
