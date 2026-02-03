public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={150,20,50,10,30,40,15,100,200};
        int largest,secondLargest;

        if(arr[0]>arr[1]){
            largest = arr[0];
            secondLargest = arr[1];
        }
        else{
            largest = arr[1];
            secondLargest = arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largets = "+largest);
        System.out.println("Second largest = "+secondLargest);
    }
}
