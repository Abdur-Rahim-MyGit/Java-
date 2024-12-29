import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int stud[]={4,5,2,6,8,1,7,3};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value to find : ");
        int key=sc.nextInt();
        for (int i = 0; i < stud.length; i++) {
            System.out.print(stud[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < stud.length; i++) {
           
            if(stud[i]==key) {
                System.out.println(" ------- Data Found = " + key +" ------- ");
                return;
                
            }
        }
        sc.close();
    }
}
