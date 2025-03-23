
class Cipher {

    String plainText;
    int key;

    Cipher(String plainText, int key) {
        this.plainText = plainText;
        this.key = key;
    }

    String Encryption() {
        return "";
    }

    String Decryption(String encryptedText) {
        return "";
    }
}

class Substitution_Cipher extends Cipher {

    Substitution_Cipher(String plainText, int key) {
        super(plainText, key);
    }

    String Encryption() {
        String plain = "abcdefghijklmnopqrstuvwxyz";
        String cipher = "qazwsxedcrfvtgbyhnujmikolp";
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (Character.isLowerCase(c)) {
                encrypted.append(cipher.charAt(plain.indexOf(c)));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    String Decryption(String encryptedText) {
        String plain = "abcdefghijklmnopqrstuvwxyz";
        String cipher = "qazwsxedcrfvtgbyhnujmikolp";
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            if (Character.isLowerCase(c)) {
                decrypted.append(plain.charAt(cipher.indexOf(c)));
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Substitution_Cipher sc = new Substitution_Cipher("gcet", 0);
        String encryptedText = sc.Encryption();
        System.out.println("Encrypted: " + encryptedText);
        System.out.println("Decrypted: " + sc.Decryption(encryptedText));
    }
}
