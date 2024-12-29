import java.util.Scanner;
public class linearsearch01 {
    public static int linear(int myarray[],int key){
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i]==key) {
                return i;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        int myarray[]={2,3,4,5,6,7,8,9};
        System.out.println("Elements are = { 2 3 4 5 6 7 8 9 }");
        System.out.println("Enter the Element to Search in Lis : ");
        Scanner obj =new Scanner(System.in);
        int key =obj.nextInt();
        int index=(linear(myarray,key));
        
        if (index==-1) {
            System.out.println("not Found ");
        }
        else{
            System.out.println("Data Found at Index : "+index);
        }
        obj.close();
    }
}
