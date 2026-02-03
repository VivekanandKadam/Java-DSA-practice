public class CountEvenOddNumArrray {
    
public static void main(String[] args) {
    int countEven = 0;
    int countOdd = 0;
    int arr[]={10,11,23,32,40,44,22,10,9,0};
    for(int i = 0; i < arr.length; i++){
        if(arr[i] % 2 == 0){
            countEven++;
        }
        else{
            countOdd++;
        }
    }
    System.out.println("Even number of elements in array = "+countEven);
    System.out.println("Odd number of elements in array = "+countOdd);
    
}    
}
