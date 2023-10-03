import java.lang.Math;
public class exercice4 {
    public static void main(String[] args){
        Double count = 0.0;
        Integer start = 1;
        Integer end = 10;

        for(Integer i = start; i <= end; i++){
            count += Math.pow(i, 2);
        }
        System.out.println("La somme des carrés des nombres entre " + start + " et " + end + " est : " + count);
    }
}