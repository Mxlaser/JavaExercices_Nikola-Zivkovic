public class exercice2 {
    public static void main(String[] args){   
        if(args.length > 0){
            for(Integer i = Integer.parseInt(args[0]); i < Integer.parseInt(args[1]); i++){
                if(i % 3 == 0){
                    System.out.print("Fizz");
                }
                else if(i % 5 == 0){
                    System.out.print("Buzz");
                }
                else if(i % 3 == 0 && i % 5 == 0){
                    System.out.print("FizzBuzz");
                }
                else{
                    System.out.print(i);
                }
                System.out.print(" ");
            }
        }
        else{
            System.out.println("Erreur");
        }
    }
}