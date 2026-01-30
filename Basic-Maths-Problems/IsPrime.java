import java.util.Scanner;
public class IsPrime{
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of t");
        t = sc.nextInt();
        for(int i = 0;i < t;i++){
            int num = sc.nextInt();
            int count = 0;
            for(int j = 2; j * j <= num;j++){
                if(num % j == 0){
                    System.out.println(num+" : is not a prime");
                    count = 0;
                    break;
                }
                else{
                    count = 1;
                }
            }
            if (count == 1) {
                System.out.println(num + " : is a prime number");
            }
        }
        sc.close();
    }
}