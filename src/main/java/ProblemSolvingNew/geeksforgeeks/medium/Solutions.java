package ProblemSolvingNew.geeksforgeeks.medium;

import ProblemSolvingNew.geeksforgeeks.utility.BinaryTree;
import ProblemSolvingNew.geeksforgeeks.utility.CommonUtility;
import ProblemSolvingNew.geeksforgeeks.utility.Node;
import ProblemSolvingNew.geeksforgeeks.utility.Point;
import com.google.common.math.IntMath;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Solutions {

    public boolean q1(Point p1, Point p2, Point p3, Point p4) {
        // condition 1st distance btn all 4 points should be equal
        //Point.distance()


        return false;
    }

    public boolean q2(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        return checkClockwise(str1, str2) || antiClockWise(str1, str2);

    }

    private boolean antiClockWise(String str1, String str2) {
        int length = str1.length() - 1;
        for (int i = length; i > 0; i--) {
            String substring1 = str1.substring(0, i);
            String substring2 = str2.substring(length - i, length);
            if (substring1.equals(substring2)) {
                String substring11 = str1.substring(i, length);
                String substring22 = str2.substring(0, length - i);
                if (substring11.equals(substring22)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean checkClockwise(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            String substring1 = str1.substring(i);
            String substring2 = str2.substring(0, str1.length() - i);

            if (substring2.equals(substring1)) {
                String substring11 = str1.substring(0, i);
                String substring22 = str2.substring(str1.length() - i, str1.length());
                if (substring11.equals(substring22))
                    return true;
            }
        }
        return false;
    }

    public int[] q3(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        AtomicInteger i = new AtomicInteger();
        int j = 0;
        stack.push(-1);
        while (j < arr.length && !stack.isEmpty()) {
            if (stack.peek() < arr[j]) {
                // Step 1 -- add value to response array
                result[i.getAndIncrement()] = stack.peek();
                stack.push(arr[j]);
                j++;
            } else {
                // step 2 -- here we have to pop if value
                stack.pop();
            }
        }
        return result;
    }

    public boolean q5(int[] arr, int x) {
        Set<Integer> intVsInt = new HashSet<>();
        for (int j : arr) {
            if (intVsInt.contains(j)) {
                return true;
            } else {
                int a = x / j;
                intVsInt.add(a);
            }
        }
        return false;
    }

    public String q6(int x, int count, String currentValue) {
        if (currentValue.equals("1")) {
            return count + "";
        }
        return q6(x / 2, count + 1, x % 2 + "");
    }

    public void q7(String[] x) {
        q7(new String[]{"A", " ", "B", "C"});
        q7(new String[]{"A", " ", "B", "C"});
        q7(new String[]{"A", "B", " ", "C"});

    }


    public static void main(String[] args) {
        a.add("A");
        a.add("B");
        a.add("C");
        combination(4);


    }

    static LinkedHashSet<String> a = new LinkedHashSet<>();

    private static void combination(int length) {
        if (length < 1) {
            System.out.println(a);
            return;
        }
        combination(length - 1);
        insertSpaceAt(length);
        combination(length - 1);
        insertSpaceAt(length);
        combination(length - 1);
        insertSpaceAt(length);
    }

    private static void insertSpaceAt(int length) {
        a.add(" ");
    }

    /**
     *
     */
    public int q8(int i) {
        int i1 = reverseNum(i);
        return reverseNum(i1);
    }

    private int reverseNum(int i) {
        int number = 0;
        while (i > 0) {
            int temp = i % 10;
            if (temp == 0) {
                temp = 5;
            }
            number = number * 10 + temp;
            i = i / 10;
        }
        return number;
    }

    public int[][] q9(int[][] mat, int row, int column) {
        int[] rowCheck = new int[row];
        int[] columnCheck = new int[column];
        Arrays.fill(rowCheck, 0);
        Arrays.fill(columnCheck, 0);
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (mat[i][j] == 1) {
                    rowCheck[i] = 1;
                    columnCheck[j] = 1;
                }
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (rowCheck[i] == 1 || columnCheck[j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }
        return mat;
    }

    public int[] q10(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[0];
            int j;
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
    }

    public String q11(String number, int i) {
        Stack<String> stack = new Stack<>();
        int pointer = 0;
        while (i > 0 && pointer < number.length()) {
            if ((number.charAt(pointer) + "").equals("0") && stack.isEmpty()) {
                pointer++;
            }
            if (stack.isEmpty()) {
                String c = number.charAt(pointer) + "";
                stack.push(c);
                pointer++;
            } else {
                if (Integer.parseInt(stack.peek()) > Integer.parseInt(number.charAt(pointer) + "")) {
                    stack.pop();
                    i--;
                } else {
                    stack.push(number.charAt(pointer) + "");
                    pointer++;
                }
            }
        }
        for (int j = pointer; j < number.length(); j++) {
            stack.push(number.charAt(j) + "");
        }
        StringBuilder finalString = new StringBuilder();
        while (!stack.isEmpty()) {
            finalString.insert(0, stack.pop());
        }
        return finalString.toString();
    }

    public double q12(int hr, int min) {
        double initialDegree = Math.abs((((hr > 6) ? hr - 12 : hr) * 60) * .5);
        double minDegree = Math.abs((min > 30 ? 60 - min : min) * 6);
        double additionalHrDegree;
        if (minDegree < initialDegree) {
            additionalHrDegree = initialDegree - min * .5;
        } else {
            additionalHrDegree = min * .5 + initialDegree;
        }
        return Math.abs(additionalHrDegree - minDegree);
    }

    public boolean q171(int n) {
        if (n <= 0) return true;
        if (n % 2 == 0) return false;
        return q171(n / 2);
    }

    public boolean q15(BinaryTree tree) {
        boolean b = postOrderTraverse(BinaryTree.root);
        System.out.println(sum);
        return b;
    }

    static int sum = 0;

    public boolean postOrderTraverse(Node tree) {
        // todo : review
        if (tree == null) return true;

        postOrderTraverse(tree.left);
        postOrderTraverse(tree.right);
        if (tree.left != null) sum = sum + tree.left.data;
        if (tree.right != null) sum = sum + tree.right.data;
        return sum == tree.data;
    }

    public boolean q15(int n) {
        for (int i = 2; i * i <= n; i++) {
            double val = Math.log(n) / Math.log(i);
            if ((val - (int) val) < 0.00000001) return true;
        }
        return false;
    }


    public boolean q16(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a.data != b.data) {
            return false;
        }
        return q16(a.left, b.right) && q16(a.right, b.left);
    }

    /**
     * total number - excluding zero
     */
    public int q17(int number) {
        return 9 * 10 * 10 * 10 - 9 * 9 * 9 * 9;
    }

    public int q18(int i, int j) {
        int i1 = i ^ j;
        return CommonUtility.countSetBit(i1, 0);
    }


    public int q19(int[] arr, int i) {
        int startingIndex = findStartingIndex(arr, i, 0, arr.length - 1);
        int endIndex = findEndIndex(arr, i, 0, arr.length - 1);
        System.out.println(endIndex);
        return (endIndex - startingIndex);
    }

    private int findEndIndex(int[] arr, int i, int start, int end) {
        int middle = (start + end) / 2;
        if (middle < end) {
            if (arr[middle] == i && arr[middle + 1] > i) {
                return middle;
            }
            if (arr[middle] == i && arr[middle + 1] >= i) {
                return findStartingIndex(arr, i, start, middle);
            } else {
                return findStartingIndex(arr, i, start, end);
            }
        }
        return -1;
    }

    //{1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 }
    private int findStartingIndex(int[] arr, int i, int start, int end) {
        int middle = (start + end) / 2;
        if (middle < end) {
            if (arr[middle] < i && arr[middle + 1] == i) {
                return middle;
            }
            if (arr[middle] == i && arr[middle + 1] >= i) {
                return findStartingIndex(arr, i, start, middle);
            } else {
                return findStartingIndex(arr, i, start, end);
            }
        }
        return -1;
    }

    public int q20(int[] arr, int i) {
        return 0;
    }

    public int q21(int i, int j, int m, int n) {
        if (i > m || j > n) return 0;
        if (i == m && j == n) {
            return 1;
        }
        return q21(i + 1, j, m, n) + q21(i, j + 1, m, n);
    }

    public int q211(int m, int n) {
        int x[] = {1, 0};
        int y[] = {0, 1};

        int k = 0, l = 0;

        Stack<Point> stack = new Stack<>();
        stack.push(new Point(k, l));

        int count = 0;
        while (!stack.isEmpty()) {
            Point pop = stack.pop();
            if (pop.x == m - 1 && pop.y == n - 1) {
                count++;
            }
            for (int o = 0; o < x.length; o++) {
                if (pop.x + x[o] < m && pop.y + y[o] < n) {
                    stack.push(new Point(pop.x + x[o], pop.y + y[o]));
                }
            }
        }
        return count;
    }


    public int q22(Integer[] arr, int sum) {
        combinations2(arr, 3, 0, new Integer[3]);
        return 0;
    }

    //    arr[] = {5, 1, 3, 4, 7}
    static void combinations2(Integer[] arr, int len, int startPosition, Integer[] result) {
        if (len == 0) {
            System.out.println(Arrays.toString(result));
            return;
        }
        for (int i = startPosition; i <= arr.length - len; i++) {
            result[result.length - len] = arr[i];
            combinations2(arr, len - 1, i + 1, result);
        }
    }

    public long q23(String[] arr, int count) {
        Map<String, Integer> valueVsCount = new HashMap<>();

        for (String s : arr) {
            Integer integer = Optional.ofNullable(valueVsCount.get(s))
                    .orElse(0);
            valueVsCount.put(s, integer + 1);
        }

        return valueVsCount.entrySet()
                .stream()
                .filter(value -> value.getValue().equals(count))
                .count();
    }

    /**
     * Example:
     * {-7, 1, 5, 2, -4, 3, 0}
     * <p>
     * -7   -6  -1   1  -3  0   0
     * -10  -3  -4   1  -1  3   0
     * <p>
     * <p>
     * -16  -9  -3  -2  -3  0   0
     * <p>
     * [1,7,3,6,5,6]
     * 28
     * <p>
     * 27, 1
     * 20, 8
     * 17, 11
     * 11,
     */
    public int q24(Integer[] arr) {
        int i = 0;
        int temp2 = 0;
        int sum = Stream.of(arr).mapToInt(Integer::intValue).sum();
        while (i < arr.length) {
            sum = sum - arr[i];
            if (Math.abs(sum) == Math.abs((int) temp2)) {
                return i;
            }
            temp2 = temp2 + arr[i];
            i++;
        }
        return -1;
    }

    // * Input : {1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1}
    public int q25(Integer[] arr) {
        int maxDistanceSoFar = 0, maxDistanceNow = 0;
        for (Integer integer : arr) {
            if (integer.equals(1)) {
                if (maxDistanceNow != 0) {
                    if (maxDistanceSoFar < maxDistanceNow) {
                        maxDistanceSoFar = maxDistanceNow;
                    }
                    maxDistanceNow = 0;
                }
            } else {
                maxDistanceNow++;
            }
        }
        return maxDistanceSoFar - 1;
    }

    // {1, 3, 5, 5, 5, 5, 67, 123, 125};
    public int[] q26(int[] arr, int i) {
        int startingIndex = findStartingIndexOfNumber(arr, i, 0, arr.length - 1);
        int startingIndexEnd = findStartingIndexOfNumberEnd(arr, i, 0, arr.length - 1);
        System.out.println(startingIndex);
        System.out.println(startingIndexEnd);
        return new int[]{startingIndex, startingIndexEnd};
    }

    private int findStartingIndexOfNumber(int[] arr, int i, int start, int end) {
        int middle = (start + end) / 2;
        if (middle < end) {
            if (arr[middle] != i && arr[middle + 1] == i) {
                return middle + 1;
            }
            if (arr[middle] <= i) return findStartingIndexOfNumber(arr, i, start, middle);
            else return findStartingIndexOfNumber(arr, i, middle + 1, end);

        }
        return -1;
    }

    private int findStartingIndexOfNumberEnd(int[] arr, int i, int start, int end) {
        int middle = (start + end) / 2;
        if (middle < end) {
            if (arr[middle] == i && arr[middle + 1] != i) {
                return middle;
            }
            if (arr[middle] <= i) return findStartingIndexOfNumberEnd(arr, i, middle + 1, end);
            else return findStartingIndexOfNumberEnd(arr, i, start, middle);
        }
        return -1;
    }

    public void q27(Integer[] arr, int x) {
        Integer[] integers = new Integer[4];
        combinationsTOFindSum(arr, 4, 0, integers, x);
    }

    static void combinationsTOFindSum(Integer[] arr, int len, int startPosition, Integer[] result, int x) {
        if (len == 0) {
            int sum = Arrays.stream(result).mapToInt(value -> value).sum();
            if (sum == x) {
                Arrays.stream(result).forEach(System.out::println);
            }
            return;
        }
        for (int i = startPosition; i <= arr.length - len; i++) {
            result[result.length - len] = arr[i];
            combinationsTOFindSum(arr, len - 1, i + 1, result, x);
        }
    }

    public int q28(int[] arr) {
        return findStartingIndexOfOne(arr, arr.length - 1);
    }

    private int findStartingIndexOfOne(int[] arr, int end) {
        int middle = (end) / 2;
        if (middle < end) {
            if (arr[middle] != 1 && arr[middle + 1] == 1) {
                return middle + 1;
            }
            if (arr[middle] != 0) return findStartingIndexOfNumber(arr, 1, 0, middle);
            else return findStartingIndexOfNumber(arr, 1, middle + 1, end);

        }
        return -1;
    }

    public int q38(int[] arr) {
        int temp = 0;
        for (int j : arr) {
            temp = temp ^ j;
        }
        return temp;
    }

    public int[] q39(int givenSum) {
        for (int i = 0; i < givenSum; i++) {
            if (IntMath.isPrime(i)) {
                int anotherNumber = givenSum - i;
                if (IntMath.isPrime(anotherNumber)) {
                    return new int[]{i, anotherNumber};
                }
            }
        }
        return new int[0];
    }


    public long maximiseRevenue(List<Long> pickup, List<Long> drop, List<Integer> tip) {
        // Write your code here

        Stack<Integer> index = new Stack<>();

        for (int i = 0; i < pickup.size(); i++) {
            if (index.isEmpty()) {
                index.push(i);
            } else {
                Integer peek = index.peek();
                Long dropValue = drop.get(peek);
                if (pickup.get(i) < dropValue) {
                    long previous = drop.get(peek) - pickup.get(peek) + tip.get(peek);
                    long current = drop.get(i) - pickup.get(i) + tip.get(i);
                    if (previous < current) {
                        index.pop();
                        index.push(i);
                    }

                } else {
                    index.push(i);
                }
            }
        }

        long total = 0L;
        while (!index.isEmpty()) {
            Integer pop = index.pop();
            total += drop.get(pop) - pickup.get(pop) + tip.get(pop);
        }
        return total;
    }


    Stack<Node> nodes = new Stack<>();

    public void printPaths(Node root) {
        if (root == null) {
            return;
        }
        nodes.add(root);

        if (root.left == null && root.right == null) {
            Iterator<Node> nodeIterator = nodes.elements().asIterator();
            while (nodeIterator.hasNext()) {
                Node next = nodeIterator.next();
                System.out.printf("%s ", next.data);
            }
            nodes.pop();
            System.out.println();
        } else {
            printPaths(root.left);
            printPaths(root.right);
            nodes.pop();
        }
    }

    public int q41(int[] arr) {
        int maxSumSorFar = 0;
        int maxSumTillNow = 0;
        for (int j : arr) {
            maxSumTillNow = maxSumTillNow + j;
            if (maxSumSorFar < maxSumTillNow) maxSumSorFar = maxSumTillNow;
        }
        return maxSumSorFar;
    }

    public Integer[] q42(int[] arr) {
        int last = arr.length - 1;

        for (int i = 0; i < arr.length - 1 && i < last; ) {
            if (arr[i] > 0) {
                boolean b = arr[i + 1] < 0;
                if (!b) {
                    if (arr[last] < 0) {
                        CommonUtility.swap(arr, i + 1, last);
                    }
                    last--;
                } else {
                    i++;
                }
            } else {
                boolean b = arr[i + 1] > 0;
                if (!b) {
                    if (arr[last] > 0) {
                        CommonUtility.swap(arr, i + 1, last);
                    }
                    last--;
                } else {
                    i++;
                }
            }
        }
        Arrays.stream(arr).boxed().forEach(System.out::println);
        return null;
    }

    public int[] q56(int[] arr, int k) {
        for (int i = 0; i < k; i++, k--) {
            int temp = arr[i];
            arr[i] = arr[k - 1];
            arr[k - 1] = temp;
        }
        return arr;
    }

    // wwwwaaadexxxxxx
    public String q57(String inputString) {
        char lastVisited = '\n';
        String finalString = "";
        int count = 1, i = 0;
        do {
            char c = inputString.charAt(i);
            if (lastVisited == c) {
                count++;
                i++;
            } else if (lastVisited != '\n') {
                finalString = finalString + lastVisited + count;
                count = 1;
                lastVisited = '\n';
            } else {
                lastVisited = c;
                i++;
            }
        } while (inputString.length() > i);
        finalString = finalString + lastVisited + count;
        return finalString;
    }


    public int countConnections(List<List<Integer>> matrix) {
        Set<String> validPairs = new HashSet<>();
        Set<String> visited = new HashSet<>();
        Point initial = new Point(0, 0);
        Stack<Point> stack = new Stack<>();
        stack.push(initial);

        int[] x = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] y = {-1, 0, 1, 1, 1, 0, -1, -1};

        while (!stack.isEmpty()) {
            Point pop = stack.pop();
            visited.add(pop.x + "" + pop.y);

            for (int i = 0; i < x.length; i++) {
                if (isValidIndex(pop.x + x[i], pop.y + y[i], matrix)
                        && matrix.get(pop.x + x[i]).get(pop.y + y[i]) == 1) {

                    String s = String.format("%d%d%d%d", pop.x, pop.y, pop.x + x[i], pop.y + y[i]);

                    if (!visited.contains((pop.x + x[i]) + "" + (pop.y + y[i])) && !validPairs.contains(s)) {
                        validPairs.add(s);
                        stack.push(new Point(pop.x + x[i], pop.y + y[i]));
                    }
                }
            }
        }
        return validPairs.size();
    }


    boolean isValidIndex(int r, int c, List<List<Integer>> matrix) {
        int row = matrix.size();
        int col = matrix.get(0)
                .size();
        return (r < row && c < col) && (r >= 0 && c >= 0);
    }


    public int tilingProblem1(int size) {
        if (size == 0) return 0;
        if (size == 1) return 1;

        return tilingProblem(size - 1) + tilingProblem( size - 2);
    }

    public int tilingProblem(int size) {
        if (size == 0) return 0;
        if (size == 1) return 1;

        return tilingProblem(size - 1) + tilingProblem( size - 2);
    }

    public int heightOfTree(Node root) {
        int count = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(null);
        q.add(root);

        while (!q.isEmpty()) {
            Node pop = q.poll();
            if (Objects.isNull(pop)) continue;
            Node peek = q.peek();
            Optional.ofNullable(pop.left).ifPresent(q::add);
            Optional.ofNullable(pop.right).ifPresent(q::add);
            if (peek  == null) {
                count++;
                q.add(q.poll());
            }

        }
        return count - 1;
    }
}
