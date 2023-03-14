import java.util.HashMap;
import java.util.Map;

public class FrequencyAnatysis {
    public String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public Map<Character, Integer> getFreq(String text) {

        text = text.toLowerCase();

        Map<Character, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < ALPHABET.length(); ++i) {
             frequencies.put(ALPHABET.charAt(i), 0);
        }
        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            if (ALPHABET.indexOf(c) != -1)
                frequencies.put(c, frequencies.get(c) + 1);
        }

        return frequencies;
    }

    public void showFrequencies(String text) {
        Map<Character, Integer> frequencies = getFreq(text);
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            System.out.format("Character %s has frequency:%s%n", entry.getKey(), entry.getValue());
        }
    }

    public Map.Entry<Character, Integer> maxFreq(Map<Character, Integer> frequencies){
        Map.Entry<Character, Integer> max=null;
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
             if(max==null||entry.getValue().compareTo(max.getValue())>0)
                 max=entry;
         }

        return  max;
    }
}