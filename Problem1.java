// Given an array, arr[] of n integers, and an integer element x, find whether element x is present in 
// the array. Return the index of the first occurrence of x in the array 
// or -1 if it doesn't exist.

public class Problem1 {

    public static void main(String[] args) {
        int arr[]={22,43,1,256,86,87};
        int x=24;
        boolean found=false;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
          
                found=true;
                break;

            }
        }
        if(found){
            System.out.println("found element" );
        }
        else{

        System.out.println(-1);
        }
    }
}