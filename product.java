import java.util.Scanner;

public class product{
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int y=sc.nextInt();
            int x=sc.nextInt();
            int printme=multiply(x,y);
            System.out.println(printme);
            sc.close();
    }

    public static int multiply(int a, int b){
        return a*b;
    }
    
}