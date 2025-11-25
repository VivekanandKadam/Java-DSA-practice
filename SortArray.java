public class SortArray {
    public static void main(String[] args) {
        int arr[] = {10,11,20,8,7,10,25};
        System.out.println("Array before sort");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nArray after sort");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
