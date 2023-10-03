public class exerciceBonus {
    public static void main(String[] args){
        /*Integer h = Integer.parseInt(args[0]);
        for(Integer i = 1; i <= h; i++){
            for(Integer j = h-i; j > 0; j--){
                System.out.print(" ");
            }
            for(Integer k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //-----------------
        for(int i = 1; i <= h-1; i++){
            System.out.print(" ");
            for(int j = h-3; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 2; k > 0; k--){
                System.out.print("| ");
            }
            System.out.println();
        }*/
        Integer h = 5;
        Integer x = 1;
        Integer l = 7;
        Integer space = l*5;
        for(Integer a = 1; a <= h; a++){
            for(Integer i = x; i <= l; i++){
                for(Integer j = space; j >= i; j--){
                    System.out.print(" ");
                }
                for(Integer k = 1; k <= i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            x = x+2;
            l = h+2;
        }
    }
}