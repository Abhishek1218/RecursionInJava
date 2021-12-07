import java.util.*;

public class sortStrIncArr {

    public static boolean isSorted(int arr[], int idx){

        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;           
        }
        return isSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array: ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(isSorted(arr, 0));
    }
}
