import generatearray.generateArray;
import java.util.ArrayList;

public class exercice2 {
    public static void main(String[] args){
        generateArray objet = new generateArray();
        objet.generate(10,100);
        ArrayList<Integer> liste = objet.getList();
        System.out.print("Liste d'origine : " + liste);

        for(Integer i = 0; i < liste.size() - 1; i++){
            for(Integer j = 0; j < liste.size() - i - 1; j++){
                if(liste.get(j) < liste.get(j + 1)){
                    Integer temp = liste.get(j);
                    liste.set(j, liste.get(j + 1));
                    liste.set(j + 1, temp);
                }
            }
        }
        System.out.print("Liste triée : ");
        System.out.println(objet.getList());
    }
}