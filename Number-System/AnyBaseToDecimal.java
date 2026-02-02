import java.util.Scanner;
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int sum = 0, place = 1, reminder =0;
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : \n1) Binary to decimal \n2) Octal to Decimal \n3) Hexadecimal to decimal");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter binary number to convert into decimal :");
                num = sc.nextInt();
                while (num!=0) {
                    reminder = num % 10;
                    sum = sum + reminder * place;
                    place = place * 2;
                    num = num / 10;
                }
                System.out.println("Converted value : "+sum);
                break;
            case 2:
                System.out.println("Enter octal number to convert into decimal :");
                num = sc.nextInt();
                while (num!=0) {
                    reminder = num % 10;
                    sum = sum + reminder * place;
                    place = place * 8;
                    num = num / 10;
                }
                System.out.println("Converted value : "+sum);
                break;
            case 3:
                System.out.println("Enter hexadecimal number to convert into decimal :");
                num = sc.nextInt();
                while (num!=0) {
                    reminder = num % 10;
                    sum = sum + reminder * place;
                    place = place * 16;
                    num = num / 10;
                }
                System.out.println("Converted value : "+sum);
                break;
        
            default:
                break;
        }
        sc.close();
    }    
}
