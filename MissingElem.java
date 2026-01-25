public class MissingElem {

    public static void arrEl(int arr[]){ 
        long n=arr.length +1;
        long sum=0;
        long arrSum=n*(n+1)/2; 
        
       
    for (int elem : arr) 
        {
            sum +=elem;
        }
        System.out.println("missing element is: " + (int)(arrSum-sum));
    }

        public static void main (String args[]){
             int arr[]={1,2,3,4,5,7};
            
             arrEl(arr);
             


        
    }

    
}
