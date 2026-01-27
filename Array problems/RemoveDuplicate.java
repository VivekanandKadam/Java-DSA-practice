public class RemoveDuplicate{
    public static void main(String[] args) {
        int arr[]={12,13,34,53,56,32,67,87,53,78,34,12,12,53,53};
        for(int i = 0; i < arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}