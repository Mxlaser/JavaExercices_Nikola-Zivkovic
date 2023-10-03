import java.util.*;
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
            /*if(tab[case1][case2] == ""){
                tab[case1][case2] = "X";
                grille("X");
            }
            else{
                System.out.println("Case déjà prise");
            }*/
            tab[case1][case2] = "X";
                grille("X");
        }
        else{
            System.out.println("Ordi c'est à votre tour.");
        }
    }
}