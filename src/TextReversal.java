
import java.util.HashMap;
import java.util.Map;

public class TextReversal {
        private static final Map<Integer,Character> initialNonLetterOrder = new HashMap<>();


        public static void reverseText(String text){
            String[] arraysWords = splitTextIntoWords(text);
            StringBuilder reverseText = new StringBuilder();
            String oneWord ;
            String reverseOneWord ;

            for (int i = 0; i < arraysWords.length; i++) {
                oneWord = arraysWords[i];
                reverseOneWord = reverseWord(oneWord);
                initialNonLetterOrder.clear();
                reverseText = reverseText.append(reverseOneWord).append(" ");
            }

            System.out.println(reverseText);
        }

        private static String[] splitTextIntoWords(String inputText){
            String[] arraysWords = inputText.split(" ");
            return  arraysWords;
        }


        private static String reverseWord(String oneWord){
            StringBuilder reverseWord = new StringBuilder();


            for (int i = oneWord.length()-1; i >= 0 ; i--) {
                char symbol = oneWord.charAt(i);
                boolean uppercaseLatin = (97 <= symbol & symbol <= 122);
                boolean capitalLatin = (65 <= symbol & symbol <= 90);
                boolean uppercaseRussian = (1072 <= symbol & symbol <= 1103);
                boolean capitalRussian = (1040 <= symbol & symbol <= 1071);

                if (!(uppercaseLatin | capitalLatin | uppercaseRussian | capitalRussian))
                {
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

