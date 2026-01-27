public class SplitArrayInTwoPartsIfPossible {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};

        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        if(arr.length % 2 == 0){
            int halfLength = arr.length/2;

            System.out.println("\nFirst part");

            for(int i = 0; i <halfLength; i++){
                System.out.print(arr[i]+" ");
            }

            System.out.println("\nSecond part");

            for(int i = halfLength; i<arr.length; i++){    
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("Split is not possible");
        }
        
    }
}
