package ProblemSolvingNew.geeksforgeeks.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int) (n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();
            obj.segregateElements(a, n);

            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");

            System.out.println();
        }
    }
}

class Solution {

    public void segregateElements(int arr[], int n) {

        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> um = new HashMap<>();
        um.put(1, um.get())
        // Your code goes here
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp = arr[i];
                arr[arr.length - 1] = temp;
            }
        }
    }
}