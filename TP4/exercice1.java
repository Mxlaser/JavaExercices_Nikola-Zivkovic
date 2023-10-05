/*import java.util.*;
import java.util.Scanner;
public class exercice1{

    private static void grille(String choix){
        for(Integer i = 0; i < 3; i++){
            System.out.print("-------------------");
            System.out.print("\n");
            for(Integer j = 0; j < 4; j++){
                if(choix == "X"){
                    System.out.print("|  X  ");
                }
                else if(choix == "O"){
                    System.out.print("|  O  ");   
                }
                else{
                    System.out.print("|     ");
                }
            }
            System.out.println("");
        }
        System.out.println("-------------------");
    }
    
    public static void main(String[] args){

        Random ran = new Random();
        Integer joueur = ran.nextInt(2);
        String[][] tab = new String[3][3];

        grille("");

        if(joueur == 0){
            System.out.println("Joueur c'est à votre tour.");
            Scanner scan = new Scanner(System.in);
            System.out.println("Entrez la ligne (0-2) et la colonne (0-2) : ");
            Integer case1 = Integer.parseInt(scan.nextLine());
            Integer case2 = Integer.parseInt(scan.nextLine());
            if(tab[case1][case2] == ""){
                tab[case1][case2] = "X";
                grille("X");
            }
            else{
                System.out.println("Case déjà prise");
            }
            tab[case1][case2] = "X";
                grille("X");
        }
        else{
            System.out.println("Ordi c'est à votre tour.");
        }
    }
}*/

import java.util.Random;
import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {

        char tab[][] = {    {' ',' ',' '},
                            {' ',' ',' '},
                            {' ',' ',' '}
                            };

        Random rand = new Random();
        Integer firstJ = rand.nextInt(1,3);
        char joueurActuel;

        if(firstJ == 1){
            joueurActuel = 'X';
            System.out.println("Joueur, c'est à votre tour.");
            System.out.println();
        }
            
        else if(firstJ == 2){
            joueurActuel = 'O';
            System.out.println("Tour de l'ordinateur.");
            System.out.println();
        }

        afficherTableau(tab);
    }


    public static void Partie(){
        Scanner scanner= new Scanner(System.in);
        Integer ligne;
        Integer colonne;
        Boolean fin = false;
    }

    public static void afficherTableau(char tab[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j]);
                if (j < 2) {
                    System.out.print("   |");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("--------------");
            }
        }
        System.out.println();
    }

}