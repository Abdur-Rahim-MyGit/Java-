import java.util.Scanner;
public class BinarySearch {
    public static int BSearch(int myarray[],int key ){
        int start=0, end=myarray.length-1;
            while (start<=end) {
                int mid=(start+end)/2;
                if (myarray[mid]==key) {
                    return mid;
                }
                if(myarray[mid]<key){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
             return -1;
    }
    public static void main(String[] args) {
        //Taking Inputs from User-------------------------------
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n=sc.nextInt();
            int myarray[]=new int[n];
            System.out.print("Enter all the Numbers in a Single Line with Space : ");
            for (int i = 0; i < myarray.length; i++) {
                myarray[i]=sc.nextInt();
            }
            System.out.print("List of Elements are : ");
            for (int i = 0; i < myarray.length; i++) {
                
                System.out.print(myarray[i]);
                System.out.print(" ");
            }
            System.out.println(" ");
            System.out.print("Enter the Element to search in the List : ");
            int key=sc.nextInt();
            // Calling Function---------------------------------------
            System.out.println(" ");
            System.out.println("Element Found in the Index  of : ");
            System.out.print(BSearch(myarray, key));
            sc.close();
        }
   }