public class RotateNum {
    public static void main(String[] args) {
        int num = 2345678,
        temp = num,
        rotation = 6,length = 0;
        while(temp!=0){
            temp = temp / 10;
            length++;
        }
        int rem = num % (int)Math.pow(10,rotation);
        int quetiont = num / (int)Math.pow(10,rotation);
        System.out.println(rem);
        System.out.println(quetiont);
        num = rem * (int)Math.pow(10,length-rotation);
        num = num + quetiont;
        System.out.println(num);
    }
}
