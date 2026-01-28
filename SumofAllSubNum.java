public class SumofAllSubNum {
    public static void main(String[] args) {
        int num=12345;
        String s=String.valueOf(num);
        int sum=0;
        for (int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String st=s.substring(i,j+1);
                sum+=Integer.parseInt(st);
            }
        }
        System.out.println(sum);
    }
    
}
