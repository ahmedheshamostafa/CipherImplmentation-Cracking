public class CaesarCipherBruteForce {

    private String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public void crack(String cipherText) {
        for (int shiftKey = 0; shiftKey < ALPHABET.length(); ++shiftKey) {
            String ptainText = "";
            for (int i = 0; i < cipherText.length(); i++) {
                int pos = ALPHABET.indexOf(cipherText.charAt(i));
                int decryptPos = (pos - shiftKey) % (ALPHABET.length());
                if (decryptPos < 0) {
                    decryptPos = ALPHABET.length() + decryptPos;
                }
                char decryptChar = ALPHABET.charAt(decryptPos);
                ptainText += decryptChar;
            }
            System.out.println("cracked message is "+ptainText+" with key= "+shiftKey);

        }

    }
}
