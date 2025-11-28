public class FindLargestNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,9,2,3};
        int largest = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest number = "+largest);
        
    }
}
