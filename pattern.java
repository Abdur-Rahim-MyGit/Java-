import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter How Many Times You Wanted to Print the Stars");
       int n=sc.nextInt();
       for (int i=1; i <=n; i++) {
        
        for (int line = 1; line <=n; line++) {
            for (int stars=1; stars <=line; stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int line = 1; line <=n; line++) {
            for (int stars=1; stars <= (n-line+1); stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }sc.close();
    }
}
