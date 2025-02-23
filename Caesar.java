import java.util.Scanner;

class Caesar {
    // Encrypts text using a shift of s
    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = (char) (((ch - 'A' + s) % 26) + 'A');
            } else if (Character.isLowerCase(ch)) {
                ch = (char) (((ch - 'a' + s) % 26) + 'a');
            }
            result.append(ch);
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for text
        System.out.print("Enter text to encrypt: ");
        String text = scanner.nextLine();

        // Taking user input for shift value
        System.out.print("Enter shift value: ");
        int s = scanner.nextInt();

        // Encrypt and display the result
        System.out.println("\nText  : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));

        scanner.close();
    }
}
