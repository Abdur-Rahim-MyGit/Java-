public class Arrays_cocept {

public static int largefun(int myarray[]){
    int temp=Integer.MIN_VALUE;
    for (int i = 0; i < myarray.length; i++) {
        if(myarray[i]>temp){
            temp=myarray[i];
        }   
    }
    return temp;
}

// Largest Number in an Array
    public static void main(String[] args) {
       int myarray[]={20,54,4,42,5,21,75,43,53,65,51,6,52,2};
        System.out.println(largefun(myarray));
    }

    }
