import java.util.*;
public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;

        System.out.println("Enter ur choice \n1) Binary addition \n2) Octal Addition \n3) Hexadecimal Addition");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                
                break;
        
            default:
                break;
        }
        sc.close();
    }
}
