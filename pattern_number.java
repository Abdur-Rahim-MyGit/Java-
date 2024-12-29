public class pattern_number {
    public static void main(String[] args) {
        for (int i = 1; i<=4;i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        char alp='A';
        for (int i = 1; i<=4;i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(alp);
                alp++;
            }
            System.out.println();
        }
        for (int i = 1; i<=3;i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("1 0 ");
                
            }
            System.out.println();
        }
    }
}
