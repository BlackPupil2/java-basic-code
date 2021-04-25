package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*筛选偶数放到小集合*/
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        Random r1=new Random();
        ArrayList<Integer> bigList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num= r1.nextInt(100)+1;
            //1到100
            bigList.add(num);

        }
       ArrayList<Integer> smallList=getSmallList(bigList);
        System.out.println("偶数个数："+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }

    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num=bigList.get(i);
            if(num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
