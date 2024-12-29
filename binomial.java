import java.util.Scanner;
public class binomial extends faactorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int nums=sc.nextInt();
        int some=facto(nums);
        System.out.println(some);
        sc.close();
        System.out.println();
    }
}

