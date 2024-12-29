import java.util.Scanner;
public class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // --------Array---------- limit
        int students[]=new int[10];
        students[0]=90;
        students[1]=72;
        students[2]=57;
        students[3]=32;
        students[4]=76;
        students[5]=43;
        students[6]=67;
        students[7]=54;
        students[8]=32;
        students[9]=43;
        for (int i=0; i<students.length; i++) {
            System.out.print(students[i]);
        }System.out.println("");
        // --------String---------------
        String name[]={"souban","aadi","rahim"};
        System.out.print(name[1]);
        System.out.println("");
        for (int i=0; i<name.length; i++) {
            System.out.print(name[i]);
        }   System.out.println("");

        // ----------Different Ways to Define the Array-------------
        int studlist[]={9,6,2,4,6,9,8,9,10};
        for (int i=0; i<studlist.length; i++) {
            System.out.print(studlist[i]);
        }System.out.println("");


        // ---------Input------------
        int studlist1[]=new int[5];        
        for (int i=0; i<studlist1.length; i++) {
            studlist1[i]=sc.nextInt();
            System.out.println();
        }System.out.println(""); 
        sc.close();
    }
}