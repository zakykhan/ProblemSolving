public class StringDigPre {
    public static void main(String[] args) {
        String input = "zaky";
        char[] arr = input.toCharArray();
        StringBuilder res = new StringBuilder();
        for(char c: arr){
            if(Character.isDigit(c)){
                res.append(c);
            }
            else {
                System.out.println("There's no digit present in string...");
                break;
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
