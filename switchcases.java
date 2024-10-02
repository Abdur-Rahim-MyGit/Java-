import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int choice =sc.nextInt();
     switch (choice) {
        case 1:
            System.out.println("Aadi");
            break;
        case 2:
            System.out.println("Souban");
            break;
        case 3:
            System.out.println("Rahim ");
            break;
        default:
        System.out.println("wrong Input - Select Souban in 2nd ");
        break;
     }   
    }
}
