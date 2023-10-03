public class exercice9 {
    public static void main(String[] args) {
        Integer[] numbers = {21565, 3412, 180, 1556, 182, 84, 15};
        Integer i = 0;
        for(Integer value : numbers){
            if(value % 3 != 0){
                if(i > 0)
                    System.out.print(", ");
                System.out.print(value);
            }
            i++;
        }
        System.out.print("\n");
    }
}