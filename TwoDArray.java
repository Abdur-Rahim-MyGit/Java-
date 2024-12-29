public class TwoDArray {
    public static void main(String[] args) {
        int [][] stud=new int[3][3];
        stud[0][0]=1;
        stud[0][1]=2;
        stud[0][2]=3;
        stud[1][1]=3;
        for (int i=0; i<3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(" " + (stud[i] [j]));
            }
            System.out.println(" ");
        }

    }
}   
