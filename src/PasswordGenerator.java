import java.util.Scanner;
import java.util.Arrays;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arrNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        char[] arrLowerCaseLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] arrUpperCaseLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] arrSpecialSymbols = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=', '[', ']', '{', '}', '|', '\\', ';', ':', '"', '<', '>', ',', '.', '/', '?'};
        String password = "";
        int[] arrKey = {0, 0, 0, 0};

        while(true){
            System.out.print("Enter length of password (8 to 12): ");
            int count = in.nextInt();

            if (count > 7 && count < 13) {
                while(password.length() != count) {
                    switch (getRandomNumber(4)) {
                        case 0:
                            password += arrNumbers[getRandomNumber(10)];
                            arrKey[0] = 1;
                            break;
                        case 1:
                            password += arrLowerCaseLetters[getRandomNumber(26)];
                            arrKey[1] = 1;
                            break;
                        case 2:
                            password += arrUpperCaseLetters[getRandomNumber(26)];
                            arrKey[2] = 1;
                            break;
                        case 3:
                            password += arrSpecialSymbols[getRandomNumber(29)];
                            arrKey[3] = 1;
                            break;
                        default:
                            break;
                    }
                    if (password.length() == count) {
                        if (Arrays.stream(arrKey).anyMatch(x -> x == 0)) {
                            password = "";
                            Arrays.fill(arrKey, 0);
                        } else {
                            break;
                        }
                    }
                }
                break;
            } else {
                System.out.println("Password length must be between 8 and 12");
            }
        }
        System.out.println("Your password is: " + password);
    }

    private static int getRandomNumber(int c){
        return (int) (Math.random() * c);
    }
}
