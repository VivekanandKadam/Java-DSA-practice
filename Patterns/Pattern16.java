public class Pattern16 {
    public static void main(String[] args) {
        int n = 4,first = 0,second = 1,temp = 0;
        for(int i = 0;i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(first+" ");
                temp = first;
                first = first + second;
                second = temp;
            }
            System.out.println(" ");
        }
    }
}
