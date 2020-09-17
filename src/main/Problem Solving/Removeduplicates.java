import java.util.Arrays;

public class Removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1,22,3,44,5,6,7,8,8,9};
        int len = arr.length;

        int yo = removeDup(arr,len);
        for (int i=0; i<yo; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDup(int[] arr, int n){
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

}
