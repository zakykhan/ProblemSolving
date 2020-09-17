public class StrRevRecurr {
    public static void main(String[] args) {
        String input = "zakykhan";
        System.out.println("Original: "+input);
        String res = reverseIt(input);
        System.out.println("Reverse: "+res);
    }


    public static String reverseIt(String str){
        if(str.isEmpty()){
            return str;
        }
        else{
            return reverseIt(str.substring(1))+str.charAt(0);
        }
    }
}
