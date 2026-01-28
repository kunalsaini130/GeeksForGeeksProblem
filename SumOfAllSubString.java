public class SumOfAllSubString {
    public static void main(String[] args) {
        String s="12345";
        int sum=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i;j<s.length();j++){
                String st=s.substring(i, j+1);
                sum +=Integer.parseInt(st);
            }
        }
        System.out.print(sum);
    }

    
}