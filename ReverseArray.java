public class ReverseArray {

    public static void main(String arg[]){
        int arr[]={2,3,4,5,6,7,8};
        int j=arr.length-1,i=0;

        while (i<j) {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
            
        }
        for (int elem : arr) {
            System.out.print(elem +" ");
            
        }
    }

    
}
