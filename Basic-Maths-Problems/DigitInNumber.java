public class DigitInNumber {
    public static void main(String[] args) {
        int num = 1987654;
        int count = 0;
        while(num!=0){
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
