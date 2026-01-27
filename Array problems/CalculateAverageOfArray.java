public class CalculateAverageOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum+=arr[i];
        }
        float avg = sum/arr.length;
        System.out.println("Average of array is : "+avg);
    }
}
