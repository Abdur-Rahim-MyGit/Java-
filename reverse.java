public class reverse {
    public static void main(String[] args) {
        int num =989;
        int rev=0;
        int temp=num;

        while (num>0) {
            rev=rev*10; 
            rev = rev + num%10;
            num = num/10 ;
        }
        if (rev==temp) {
            System.out.println("correct hai Boss " + rev);
        }        
        else{
            System.out.println("Daal Mai Kuch Kala Hai Boss ");
        }
        
    }
}
