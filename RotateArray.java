public class RotateArray{
    public static void main(String[] args) {
        int array[] ={1,2,3,4,5,6,7,8,9};
        int j, n=array.length, k = 3;
        int temp[] = new int[n];

        System.out.println("Original array");
        for(int i = 0; i < n;i++){
            System.out.print(array[i]+" ");
        }
        for(int i = 0 ; i < k;i++){
            temp[i] = array[i];
        }
        for(int i = 0;i < n - k;i++){
            array[i] = array[i+k];
        }
        j=0;
        for(int i = n - k;i < n; i++){
            array[i]=temp[j];
            j++;
        }
        
        System.out.println("\nRotated array");
        for(int i = 0; i < n;i++){
            System.out.print(array[i]+" ");
        }
    }
}