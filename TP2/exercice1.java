import java.util.ArrayList;

public class exercice1 {
    private static Integer sum(ArrayList<Integer> stock) {
        Integer somme = 0;
        for(Integer i = 0; i < stock.size(); i++){
            somme = somme + stock.get(i);
        }
        return somme;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> stock = new ArrayList<Integer>();
        stock.add(14);
        stock.add(887);
        stock.add(58);
        stock.add(713);
        stock.add(179);
        stock.add(512);
        stock.add(786);
        stock.add(29);

        System.out.println(sum(stock));

    }
}