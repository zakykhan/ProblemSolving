public class StrDupChar {
    public static  void strDup(String str){
        char[] arr = str.toCharArray();
        System.out.println("Duplicates are: ");
        for(int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                        break;
                }
            }
        }
    }
    public static void main(String[] args) {
        String str = "beautiful beach";
        strDup(str);

    }
}
