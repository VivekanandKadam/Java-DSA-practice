public class Pattern21 {
    public static void main(String[] args) {
        int n = 7;
        int stars = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n/2);j++){
                if(i==((n/2) + 1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("* ");
            }
            if(i <= (n/2)){
                    stars++;
                }else{
                    stars--;
                }
            System.out.println("");
        }
    }
}
