public class CheckArrayIfSorted {
    public static void main(String[] args) {
        int arr[] ={9,8,7,6,5,4,3,2};
        boolean asscendingSorted = true;
        boolean desscendingSorted = true;

        System.out.println("Original array is");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        if(asscendingSorted == true){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    asscendingSorted = false;
                }
                if(arr[i]<arr[i+1]){
                    desscendingSorted = false;
                }
                if(asscendingSorted == false && desscendingSorted == false){
                    break;
                }
                
            }
        }
       
        if(asscendingSorted == true){
            System.out.println("\nArray is sorted in asscending order");
        }
        else if(desscendingSorted == true){
            System.out.println("\nArray is sorted in desscending order");
        }
        else{
            System.out.println("\nArray is not sorted");
        }
        
    }
}
