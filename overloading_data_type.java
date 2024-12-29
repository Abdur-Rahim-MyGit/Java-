public class overloading_data_type {    
        public static void main(String[] args) {
            System.out.println(sum(15.2f, 5.8f));
            System.out.println(sum(15, 5));
        }
        public static float sum(float a,float b){
            return a+b;
        }
        public static int sum(int a,int b){
            return a-b;
        }        
}
