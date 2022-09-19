package ProblemSolving;

public class FindLandS {
    public static void main(String[] args) {
        int[] zaky = {21,23,32,12,10,44,100,2345};
        int chota = zaky[0];
        int bada = zaky[0];

        for (int j : zaky) {
            if (j < chota) {
                chota = j;
            } else if (j > bada) {
                bada = j;
            }
        }
        System.out.println("chota :"+chota);
        System.out.println("bada :"+bada);
    }
}
