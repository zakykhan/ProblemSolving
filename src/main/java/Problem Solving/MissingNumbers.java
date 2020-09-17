
public class MissingNumbers {
    public static void main(String[] args) {
            int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9,9};

            int[] dup = new int[input.length];
            for (int i : input) {
                dup[i] = 1;
            }
            System.out.println("missing numbers in given array");

            for (int i = 1; i < dup.length; i++) {
                if (dup[i] == 0) {
                    System.out.println(i);
                }
            }
        }
    }
/*static int findNum(int[] a){
    int i,total,sum = 0,n=a.length+1;
    total = n*(n+1)/2;
    for (i = 0;i<a.length;i++){
        sum+=a[i];
    }
    int miss = total - sum;
    return miss;
}

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10};
        System.out.println(findNum(arr));

    }*/


