import java.util.ArrayList;
public class exercice5{
    private static Integer averageCalc(ArrayList<Integer>numbers){
        Integer sum = 0;

        for(Integer nbElement : numbers){
            sum = sum + nbElement; 
        }
        sum = sum / numbers.size();
        return sum;
    }
    
    public static void main(String[] args){
        ArrayList<Integer>nbArray = new ArrayList<Integer>();
        nbArray.add(75);
        nbArray.add(80);
        nbArray.add(90);
        nbArray.add(95);
        nbArray.add(85);

        Integer averageArray = averageCalc(nbArray);

        System.out.println("La moyenne de la liste est : " + averageArray);
    }
}