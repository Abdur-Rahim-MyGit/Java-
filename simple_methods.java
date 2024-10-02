import java.util.Scanner;

public class simple_methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int so =addds(a,b);
        System.out.println(so);
    }
    // 1st method
    public static void adds(int x,int y){
        int c=x+y;
        System.out.println(c);
    }
    
    // 2nd method
    public static int addds(int x,int y){
        // System.out.println("Im in the second method");
        return x+y;
    }
}
