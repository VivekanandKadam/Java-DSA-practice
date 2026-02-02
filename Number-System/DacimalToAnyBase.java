import java.util.Scanner;
public class DacimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10;
        int reminder = 0;
        int sum = 0;
        int place = 1;
        System.out.println("Enter your choice :\n1) Convert to banary \n2) Convert to octal \n3) Convert to Hexadecimal ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                while (num!=0) {
                    reminder = num % 2;
                    sum = sum + reminder * place;
                    place = place * 10;
                    num = num / 2;
                }
                System.out.println("Converted binary number is :"+sum);
                break;
            case 2:
                while (num != 0) {
                    reminder = num % 8;
                    sum = sum + reminder * place;
                    place = place * 10;
                    num = num / 8;
                }
                System.out.println("Converted binary number is :"+sum);
                break;
            case 3:
                while (num != 0) {
                    reminder = num % 16;
                    sum = sum + reminder * place;
                    place = place * 10;
                    num = num / 16;
                }
                System.out.println("Converted binary number is :"+sum);
                break;
            default:
                break;
        }
        sc.close();

    }    
}
