import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int table=sc.nextInt();
        int nums=1;
        while (nums<=10) {
            System.out.println( table + " X " + nums + " = "+nums*table);
            // nums=nums+1;
            nums++;
        }   sc.close();
    }
}
