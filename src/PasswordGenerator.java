import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arrNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        char[] arrLowerCaseLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] arrUpperCaseLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] arrSpecialSymbols = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=', '[', ']', '{', '}', '|', '\\', ';', ':', '"', '<', '>', ',', '.', '/', '?'};
        String password = "";

        while(true){
            System.out.print("Enter length of password (8 to 12): ");
            int count = in.nextInt();

            if (count > 7 && count < 13) {
                while(password.length() != count) {
                    switch (getRandomNumber(4)) {
                        case 1:
                            password += arrNumbers[getRandomNumber(10)];
                            break;
                        case 2:
                            password += arrLowerCaseLetters[getRandomNumber(26)];
                            break;
                        case 3:
                            password += arrUpperCaseLetters[getRandomNumber(26)];
                            break;
                        case 4:
                            password += arrSpecialSymbols[getRandomNumber(29)];
                            break;
                        default:
                            break;
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
        return (int) (Math.random() * c + 1);
    }
}
