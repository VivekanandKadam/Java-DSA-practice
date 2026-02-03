public class FindFrequencyOfNumber {
    public static void main(String[] args) {
        int arr[] ={1,2,1,2,3,4,5,6,4,3,2,4,5};
        int visited[] = new int[arr.length];
        
        for(int i = 0;i<arr.length;i++){  
            int count = 0;
            if(visited[i]==1){
                continue;
            }
            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                    visited[j]=1;
                }
            }    
            System.out.println("Elemet - "+arr[i]+" Frequency - "+count);
            
        }
        
    }
}
