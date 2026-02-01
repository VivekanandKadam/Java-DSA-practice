public class DigitFrequency {
    public static int calFrequency(int num,int t){
        int count = 0;
        while(num!=0){
            if((num % 10) == t){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 2345433;
        int target = 4;
        System.out.println("Frequency of digit "+target+" is : "+ calFrequency(n, target));
    }
}
