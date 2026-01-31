public class Pattern19 {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= (n/2); i++){
            int values = i;
            for(int j = 0; j <= (n/2) - i; j++){
                System.out.print("  ");
            }
            if(i > 1 || i < n){
                for(int j = 1; j <= (2 * i) - 1; j++){
                    System.out.print(values+" ");
                    if(j <= ((2 * i) - 1) / 2){
                        values++;
                    }
                    else{
                        values--;
                    }
                }
            }
            else{
                System.out.print(i);
            }
            
            System.out.println("");
            if(i==n/2){
                for(int j = 0; j < n; j++){
                    System.out.print(values + 2+" ");
                    if(j < n/2){
                        values++;
                    }
                    else{
                        values--;
                    }
                }
                 System.out.println();
            }
            
        }
        
        // Lower Part

        for(int i = (n/2); i >= 1; i--){
            int values = i;
            for(int j = 0; j <= (n/2) - i; j++){
                System.out.print("  ");
            }
            if(i > 1 || i < n){
                for(int j = 1; j <= (2 * i) - 1; j++){
                    System.out.print(values+" ");
                    if(j <= ((2 * i) - 1) / 2){
                        values++;
                    }else{
                        values--;
                    }
                }
            }
            else{
                System.out.print(i);
            }
            
            System.out.println(" ");
            
        }
    }
}
