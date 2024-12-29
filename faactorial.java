// import java.util.Scanner;

public class faactorial  {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int nums=sc.nextInt();
        // int some=facto(nums);
        // System.out.println(some);
        // int more=bino(nums, some);
        // System.out.println(more);
        System.out.println(bino(5, 2));
    }
    public static int facto(int nums){
        int fact=1;
        for (int i = 1; i<=nums; i++) {
            fact=fact*i;
        }
        return fact;
    }

       public static int bino (int n, int r) {
            int num_n=facto(n);
            int num_r=facto(r);
            int nmr=facto(n-r);
            int bino=num_n / (num_r*nmr);
        return bino;      
    }
}
