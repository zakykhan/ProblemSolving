public class StrisDigPre {
    public static void main(String[] args) {
        String input = "zaky786";
        char[] arr = input.toCharArray();
        StringBuilder res = new StringBuilder();
        for(char c: arr){
            if(Character.isDigit(c)){
                res.append(c);
            }
        }
        System.out.println(res);
        if (input.matches(".*\\d.*")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
