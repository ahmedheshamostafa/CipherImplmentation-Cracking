import java.util.Map;

public class CrackCaesarFrequencyAnatysis {
    FrequencyAnatysis freqObj;
    public String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public CrackCaesarFrequencyAnatysis(){
        this.freqObj=new FrequencyAnatysis();
    }
    public CrackCaesarFrequencyAnatysis(FrequencyAnatysis freqObj){
        this.freqObj=freqObj;

    }


    public void startCracking(String text){
        Map<Character, Integer> frequencies= freqObj.getFreq(text);
        freqObj.showFrequencies(text);
        Map.Entry<Character, Integer> entry=freqObj.maxFreq(frequencies);
        char mostFrequentLetter=entry.getKey();

        int approximateKey=ALPHABET.indexOf(mostFrequentLetter)-ALPHABET.indexOf('e');
        System.out.println("the mostt frequent char is "+ mostFrequentLetter+" the approximateKey key is "+approximateKey);

    }
}
