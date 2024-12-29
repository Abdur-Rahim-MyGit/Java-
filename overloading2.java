public class overloading2 {
    public static void main(String[] args) {
        int first = divide(2, 229);
       int second = divide(3, 42, 4);
       System.out.println(first +" "+ second);
       int outpt=prime(2);
       System.out.println(outpt);
       int outpts=allprime(10);
       System.out.println(outpts);
    }
    public static int divide(int a, int b){
        int total=a*b;
        return total;
    }
    public static int divide(int a, int b,int c){
        int total=a/b/c;
        return total;
    }
    public static int prime(int n){
        if (n%2==0) {
            System.out.println("not prime");
        }
        else{
            System.out.println("prime number");
        }
        return n;
    }
    public static int allprime(int n){
        
        for (int i = 1; i<n; i++) {
            if (i%2==0) {
                System.out.println(" ");
            }
            else{
                System.out.println("prime number" + i);
            }
        }
        
        return n;
    }
}
