public class factorial {
    public static void main(String[] args) {
        int facto= fact();
        System.out.println(facto);
    }
    public static int fact(){
        int facts=1;
        for (int i = 1; i<10; i++) {
            facts=facts*i;
        }
        return facts;
    }
}

