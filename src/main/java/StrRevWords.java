public class StrRevWords {
    static void reverse(String str[]){
        String ans = " ";
        for (int i = str.length-1; i>= 0; i--){
            ans += str[i]+" ";
        }
        System.out.println("Reversed Words: ");
        System.out.println(ans.substring(0)+ans.charAt(0));
    }

    public static void main(String[] args) {
        String str[] = " The Name Is Bond James Bond".split(" ");
        reverse(str);
    }
}
