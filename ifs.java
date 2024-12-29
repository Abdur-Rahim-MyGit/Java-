import java.util.Scanner;

public class ifs {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);  
        int age=sc.nextInt();

    if (age==18) {
        System.out.println("You are allowed in Gaming Center");
    }    
    else{
        System.out.println("You are Not allowed in Gaming Center");

    }
    sc.close();
    }

}
