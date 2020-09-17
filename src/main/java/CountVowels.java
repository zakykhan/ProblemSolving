public class CountVowels {
    public static int CountV(String str){
        char[] arr1 = str.toCharArray();
        int vowels = 0;
        int consonants =0;
       for(int i = 0; i< str.length();i++){
           char c = str.charAt(i);
           if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'){
               vowels++;
           }
           if(c>='a' && c<='z'){
               consonants++;
           }
       }
        System.out.println("VOWELS: "+vowels);
        System.out.println("CONSONANTS: "+consonants);
       return vowels & consonants;
    }

    public static void main(String[] args) {
        String str = "zakykhan";
        System.out.println(CountV(str));
    }
}
