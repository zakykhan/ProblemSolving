public class FirstUniqueChar {
   static char[] count = new char[256];
    static int getFirst(String str){
        int index = -1;
        for (int i = 0;i<str.length();i++){
            int c = str.charAt(i);
            count[c]++;
        }

        for(int i = 0; i<str.length();i++){
            if(count[str.charAt(i)] == 1){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String str = "zakykhan";
        int index = getFirst(str);
            System.out.println(str.charAt(index));
            }
}

