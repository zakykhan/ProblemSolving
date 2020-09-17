import java.util.HashMap;

public class CountOccurance {
    public static void CountOccurance(String str){
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> countmap = new HashMap<Character, Integer>();
        for (Character c : arr){
            if (countmap.containsKey(c)){
                countmap.put(c,countmap.get(c)+1);
            }
            else{
                countmap.put(c,1);
            }
        }
        System.out.println(str+":----->Occurance: "+countmap);
    }

    public static void main(String[] args) {
        String str = "Mohammad zaky Khan";
        CountOccurance(str);
    }
}
