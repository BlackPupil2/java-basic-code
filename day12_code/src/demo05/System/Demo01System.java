package demo05.System;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }
/*将src数组中前3个元素，复制到dest数组的前3个位置上
复制元素前：
src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
复制元素后：
src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]*/
    private static void demo02() {
       int[] src= {1,2,3,4,5};
       int[] dest={6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));
    }

    /*用来测试程序效率*/
    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();

        System.out.println(e-s);
    }
}
