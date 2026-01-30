public class ReverseTheNumber {
    public static void main(String[] args) {
        int num = 9876543;
        while(num!=0){
            int rem = num % 10;
            System.out.println(rem);
            num = num / 10;
        }
    }
}
