import java.util.Scanner;
public class SearchElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int arr [] = {10,20,03,40,66,44,32,23,32};
        System.out.println("Enter element to search in array:");
        int searchElement = sc.nextInt();
        for( i = 0; i < arr.length;i++){
            if(arr[i]==searchElement){
                System.out.println(searchElement+" is present in array at index "+i);
                break;
            }
        }
        if(i == arr.length){
            System.out.println(searchElement+" is not present in array");
        }
        sc.close();
    }
    
}
