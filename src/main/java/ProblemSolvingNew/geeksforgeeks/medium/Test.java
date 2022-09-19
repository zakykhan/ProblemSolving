package ProblemSolvingNew.geeksforgeeks.medium;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n= 5;
        int m = 30;

        int[] a = {5,3,1,4};

       // int count = MissingNumber(a, 4);

        int sum = ((n + 1) * (n + 2)) / 2;
        for (int j : a) {
            sum -= j;
        }

        System.out.println(sum);

        // printTable(n, m);

    }


    private static void printTable(int n, int m){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                //res.add(i*j);
                if(String.valueOf(i*j).length() != 3) {
                    System.out.print((i * j) + "\t");
                    //System.out.print("%-20s %s\n");
                } else {
                    System.out.print((i * j) + "\t");
                }
            }
            System.out.println();
        }
    }

       private static int MissingNumber(int[] array, int n) {
            // Your Code Here
            int count = 0;
            Arrays.sort(array);
            for(int i = 0; i < n; i++){
                count = count + 1;
                if(count != array[i]){
                    break;
                }
            }
            return count;
        }

}
