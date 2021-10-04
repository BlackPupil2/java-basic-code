package demo06FileAndRecursion;

public class Demo02Recursion {
    public static void main(String[] args) {
        int s = sum(3);
        System.out.println(s);
    }

    private static int sum(int n) {
        if(n==1){
            return 1;
        }
        return n+sum(n-1);


    }
}
