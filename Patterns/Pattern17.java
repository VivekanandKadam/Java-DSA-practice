public class Pattern17 {
    public static void main(String[] args) {
        int n = 6;
        int firstAndLastVal = 1, remainingValue = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j==1 || i==j){
                    System.out.print(firstAndLastVal+"\t");
                }
                else{
                    System.out.print(i+"\t");
                }
            }
            remainingValue = 1 + remainingValue;
            
            System.out.println();
            System.out.println();
        }           
    }    
}
