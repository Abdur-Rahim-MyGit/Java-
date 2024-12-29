import java.util.Scanner;

public class input {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name= sc.nextLine();
    int roll= sc.nextInt();
    boolean gender = sc.nextBoolean();
    float Marks = sc.nextFloat();
    


    System.out.println("Printing Done");
    System.out.println(name);
    System.out.println(roll);
    System.out.println(gender);
    System.out.println(Marks);
    sc.close();



    }
}
