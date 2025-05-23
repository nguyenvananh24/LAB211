package week1;

import java.util.HashMap;
import java.util.StringTokenizer;

public class WordAndCharacterCount {

    private String text;

    public WordAndCharacterCount(String text) {
        this.text = text;
    }

    public String getText() {return text;}

    public void setText(String text) {
        this.text = text;
    }

    public HashMap<String, Integer> countWords() {
        HashMap<String, Integer> wordCount = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(text);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public HashMap<Character, Integer> countCharacters() {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                characterCount.put(text.charAt(i), characterCount.getOrDefault(text.charAt(i), 0) + 1);
            }
        }
        return characterCount;
    }

}
