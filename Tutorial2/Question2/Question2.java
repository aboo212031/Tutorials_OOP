package Tutorial2.Question2;

public class Question2 {
    public static void main(String[] args) {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        String sentence1 = animal1.concat(" "+animal2).concat(" "+article).concat(" "+action);
        System.out.println(sentence1);

        String sentence2 = animal1 + " " + animal2 + " " + article + " " + action;
        System.out.println(sentence2);

    }
}
