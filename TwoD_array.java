public class  TwoD_array {
 public static void main(String[] args) {
    int matrix[][]=new int[3][3];
    matrix[0][0]=1;
    matrix[1][1]=1;
    matrix[2][2]=1;
    for(int i=0;i<3;i++){
        for (int j = 0; j <3; j++) {
            System.out.println(matrix[i][j]);
        }
    }
 }   
}
