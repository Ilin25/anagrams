
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Anagrams {

    public static void main(String[] args) throws IOException {
        BufferedReader inputText = new BufferedReader(new InputStreamReader(System.in));
        String text;
        System.out.println("Enter the text ");
        System.out.println("To exit, enter - e ");
        while ((text = inputText.readLine()) != null) {
                if (text.equals("e")) {
                    System.out.println("GOOD BYE");
                    break;
                }
                System.out.println(flipText(text));
        }
    }



    public static String flipText(String inputText){
        String[] words = inputText.split(" ");
        StringBuilder reverseText = new StringBuilder();
        String word ;
        String reverseOneWord ;

        for (int i = 0; i < words.length; i++) {
            word = words[i];
            reverseOneWord = reverseWord(word);
            reverseText = reverseText.append(reverseOneWord).append(" ");
        }
        return reverseText.toString().trim();
    }


    private static String reverseWord(String word) {
        Map<Integer, Character> initialNonLetterOrder = new HashMap<>();
        StringBuilder reverseWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            char symbol = word.charAt(i);

            if (!Character.isLetter(symbol)) {
                initialNonLetterOrder.put(i, symbol);
                continue;
            } else
                reverseWord.append(symbol);
        }

        initialNonLetterOrder.forEach((position, value)->
                reverseWord.insert(position,value.toString()));

        return reverseWord.toString();
    }
}
