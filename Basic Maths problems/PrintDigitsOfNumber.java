public class PrintDigitsOfNumber {
    public static void main(String[] args) {
        int num = 876543,
        temp = num, count = 0;
        while(temp != 0){
            temp = temp / 10;
            count++;
        }
        int div = (int)Math.pow(10,count - 1);
        while(num != 0){
            int q = num / div;
            System.out.println(q);

            num = num % div;
            div = div / 10;
        }

    }
}
