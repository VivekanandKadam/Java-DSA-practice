public class FindPairsWithGivenSum {
    public static void main(String[] args) {
        int sum = 6,result = -1;
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Pairs with having sum : "+sum);
        for(int i = 0; i < arr.length; i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    result = 1;
                }
            }
        }
        if(result==-1){
            System.out.println("No pairs with sum : "+sum);
        }
    }
}
