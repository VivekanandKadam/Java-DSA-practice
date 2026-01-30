public class GCD_LCM {
    public static void main(String[] args) {
        int n1 = 17;
        int n2 = 11;

        int org_n1 = n1,
            org_n2 = n2;

        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println(n2);
        int LCM = (org_n1 * org_n2) / n2;
        System.out.println(LCM);
    }
}
