public class Arrayss {

    public static void main(String[] args) {
        int marks[]=new int[20];
        String name="souban";
        marks[0]=21;
        marks[1]=41;
        marks[2]=41;
        marks[3]=51;
        marks[4]=71;
        marks[5]=31;
        marks[6]=61;
        marks[7]=61;
        marks[8]=31;
        marks[9]=81;
        marks[10]=31;
        marks[11]=11;
        marks[12]=21;
        // for(int i=0;i<=19;i++){
        //     System.out.println(marks[i]);
        // }
        // System.out.println(marks[10]);
        // System.out.println(name);

        int matrix[][]=new int[3][3];
        matrix[0][0]=1;
        matrix[1][1]=1;
        matrix[2][2]=1;
        for(int i=0;i<3;i++){
            for (int j = 0; j <3; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
    }
}
