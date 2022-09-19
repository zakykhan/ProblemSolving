package ProblemSolving;

public class DupNum {
    public static void main(String[] args) {
        int[] arr = {11,2,11,4,6,4,7,2,10};
        int i, j;
        System.out.println("Duplicate values:");
        for(i = 0; i<arr.length; i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
