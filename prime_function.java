import java.util.Scanner;

public class prime_function {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any number : ");
        int n=sc.nextInt();
    for (int i = 2; i <=n; i++) {
        
        if (i%2==0) {
            System.out.println(i +" : is Not Prime Num " );
        }
        else{
            System.out.println(i + " : is a Prime Num ");
        }
    }  
    sc.close();
}
    
    
}