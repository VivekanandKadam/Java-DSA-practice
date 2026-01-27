public class FindMinMaxDifference {
    public static void main(String[] args) {
        int min,max = 0;
        int arr[] = {442,413,145,46,463,114,154,165};
        min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Difference between MAX and MIN : "+(max-min));
    }
}
