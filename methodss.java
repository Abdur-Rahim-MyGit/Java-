import java.util.Scanner;

public class methodss {
    public static void main(String[] args) {
        name();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int sum=calculator(a, b);
        System.out.println(sum);
    }

    public static void name(){
        System.out.println("hello world");
        System.out.println("hello world");        
    }

    public static int calculator(int a,int b){
    // Parameters
        int sum=a+b;
        return sum;
    }
} 
