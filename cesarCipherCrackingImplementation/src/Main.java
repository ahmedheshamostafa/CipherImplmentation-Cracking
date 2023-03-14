import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CaesarCipherExample obj=new CaesarCipherExample();

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a string for encryption using Caesar Cipher: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");
        int shiftKey = Integer.valueOf(sc.nextLine());
        String encrypteddata=obj.encryptData(inputStr, shiftKey);
        System.out.println("Encrypted Data ===> "+encrypteddata);
        System.out.println("Decrypted Data ===> "+obj.decryptData(obj.encryptData(inputStr, shiftKey), shiftKey));

        CaesarCipherBruteForce myobj=new CaesarCipherBruteForce();
        myobj.crack(encrypteddata);

        CrackCaesarFrequencyAnatysis freq=new CrackCaesarFrequencyAnatysis();
        //freq.startCracking(obj.encryptData(inputStr, shiftKey));

    }
}


