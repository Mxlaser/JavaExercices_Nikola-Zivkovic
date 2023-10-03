public class exercice8 {
    public static void main(String[] args) {
        String[] color = {"bleu", "rouge", "jaune"};
        for(String value : color) {
            if(value == "bleu")
                System.out.println("La couleur préferée de Louis est le " + value);
            else if(value == "rouge")
                System.out.println("Pour sa peinture, Andrée a utilisé du " + value);
            else if(value == "jaune")
                System.out.println("Anis n'a pas de chemise " + value);
        }
    }
}