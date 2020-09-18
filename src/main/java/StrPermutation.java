import java.util.ArrayList;
import java.util.List;

public class StrPermutation {
    static void PrintCombo(String str, int index, List<String> combo){
        if(combo.size() == 3 && index < 4){
            combo.forEach(System.out::print);
            System.out.println();
            return;
        }
        for (int i = index; i <= 2; i++){
            char c = str.charAt(i);
            combo.add(c+" ");
            PrintCombo(str,index + 1,combo);
            combo.remove(combo.size() - 1);
        }
    }

    public static void main(String[] args) {
        String val = "abc";
        PrintCombo(val,0,new ArrayList<>());
    }
}
