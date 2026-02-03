public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {0,10,2,3,4,5,0,3,0,2,0,3};
        int count = 0;
        System.out.println("Original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }
        for(int i = count;i<arr.length;i++){
            arr[i] = 0;
        }
        System.out.println("\nAfter move zero to end of array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
