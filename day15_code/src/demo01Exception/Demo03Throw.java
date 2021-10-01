package demo01Exception;
/*throw关键字*/
public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr=  null;
        int e=getElemnt(arr,0);
        System.out.println(e);
    }
    public static int getElemnt(int[] arr,int index){
        if(arr== null){
            throw new NullPointerException("传递的数组值是空");
        }
        if(index<0||index>arr.length){
            throw new ArrayIndexOutOfBoundsException("");
        }
        int ele=arr[index];
        return ele;
    }

}
