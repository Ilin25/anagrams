import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        startProgram();
    }

    private static void startProgram() throws IOException {
        BufferedReader inputText = new BufferedReader(new InputStreamReader(System.in));
        String text;
        System.out.println("Введи текст ");
        System.out.println("Для выхода жми end ");
        while ((text = inputText.readLine()) != null){
            if(text.equals("end")){
                System.out.println("GOOD BYE");
                break;
            }
            TextReversal.reverseText(text);
        }
    }
}
