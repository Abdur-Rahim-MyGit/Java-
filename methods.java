public class methods{
    public static void main(String[] args) {
        methods obj1= new methods();//object 
        // cfuction call
        int rahim = obj1.grt(3, 4);
        System.out.println(rahim);

    }
    public int grt(int a, int b){
        if (a>b) {
            return a;
        }
        else{
            return b;
        }
    }
   }