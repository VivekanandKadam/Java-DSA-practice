public class FindSmallestNumber {
    public static void main(String[] args) {
        int arr[]={2,3,7,1,9,2,3};
        int smallest = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number = "+smallest);
        
    }
}
