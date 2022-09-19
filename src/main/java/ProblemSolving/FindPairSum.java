package ProblemSolving;

public class FindPairSum {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,7,8,9};
        sumPair(arr,7);
    }


    public static void sumPair(int[] arr,int sum){
        for(int i = 0; i<arr.length; i++){
            int val1 = arr[i];

            for (int j = i+1;j<arr.length;j++){
               int val2 = arr[j];

                if ((val1 + val2) == sum){
                    System.out.printf("(%d,%d) %n",val1,val2);
                }
            }
        }
    }
}
