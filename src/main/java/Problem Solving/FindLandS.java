public class FindLandS {
    public static void main(String[] args) {
        int[] zaky = {21,23,32,12,10,44,100,2345};
        int chota = zaky[0];
        int bada = zaky[0];

        for (int i = 0; i<zaky.length; i++){
            if(zaky[i] < chota){
                chota = zaky[i];
            }
            else if(zaky[i] > bada){
                bada = zaky[i];
            }
        }
        System.out.println("chota :"+chota);
        System.out.println("bada :"+bada);
    }
}
