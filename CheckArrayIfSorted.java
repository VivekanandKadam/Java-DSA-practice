public class CheckArrayIfSorted {
    public static void main(String[] args) {
        int arr[] ={9,8,7,6,5,4,3,2};
        boolean ascendingSorted = true;
        boolean descendingSorted = true;

        System.out.println("Original array");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        if(ascendingSorted == true){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    ascendingSorted = false;
                }
                if(arr[i]<arr[i+1]){
                    descendingSorted = false;
                }
                if(ascendingSorted == false && descendingSorted == false){
                    break;
                }
                
            }
        }
       
        if(ascendingSorted == true){
            System.out.println("\nArray is sorted in asscending order");
        }
        else if(descendingSorted == true){
            System.out.println("\nArray is sorted in descending order");
        }
        else{
            System.out.println("\nArray is not sorted");
        }
        
    }
}
