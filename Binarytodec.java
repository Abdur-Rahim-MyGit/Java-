public class Binarytodec {
    
    public static void main(String[] args) {
       bindec(101);
    }
    public static void bindec(int binum){
        int mynum=binum;
        int decimal=0;
        int pow=0;
        
        while (binum >= 0) {
            int lastdigit=binum%10;
            decimal = decimal+(lastdigit *(int)Math.pow(2,pow));
            pow++;
            binum=binum/10;
        }
        System.out.println(mynum + " is " + decimal);
    }
}

