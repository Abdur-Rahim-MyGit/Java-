public class overloading {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
    }
    public static int sum(int a,int b, int c){
        return a+b+c;
    }
    private static int sum(int a,int b){
        return a+b;
    }
}
