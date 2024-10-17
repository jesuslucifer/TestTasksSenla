import java.util.Arrays;
import java.util.Scanner;

public class Gallows {
    public static void main(String[] args) {

        String word = words[getRandomNumber()];
        boolean letterFound = false;
        int live = 9;
        boolean gameProccessed = true;

        char[] wordArray = word.toCharArray();
        char[] finalWord = createArrayWord(word);

        System.out.println("Welcome to the Gallows game");
        menu();

        Scanner scanner = new Scanner(System.in);

        if(scanner.nextInt() == 1 || scanner.nextLine().equals("Yes")) {        //
            System.out.println(finalWord);                                      //Проверка отгадано слово или нет
            while(gameProccessed)                                               //Одинаковые буквы запретить ввод?
            {

                System.out.println("Please enter your letter: ");
                char letter = scanner.next().charAt(0);

                for(int i = 0; i < word.length(); i++) {
                    if(letter == word.charAt(i)) {
                        finalWord[i] = wordArray[i];
                        letterFound = true;
                    }
                }

                if(!letterFound) {
                    switch (live){
                        case 9:
                            System.out.println("\t\n" +
                                "\t|\n" +
                                "\t|\t\n" +
                                "\t|\n" +
                                "\t|\n" +
                                "\t|\n" +
                                "\t|\n" +
                                "  __|__");
                            live--;
                            System.out.println("Lives: " + live);
                            break;
                        case 8:
                            System.out.println("\t _____   \n" +
                                    "\t|\n" +
                                    "\t|\t\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "  __|__");
                            live--;
                            System.out.println("Lives: " + live);
                            break;
                        case 7:
                            System.out.println("\t _____   \n" +
                                    "\t|     |\n" +
                                    "\t|\t\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "  __|__");
                            live--;
                            System.out.println("Lives: " + live);
                            break;
                        case 6:
                            System.out.println("\t _____   \n" +
                                    "\t|     |\n" +
                                    "\t|     O\t\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "  __|__");
                            live--;
                            System.out.println("Lives: " + live);
                            break;
                        case 5:
                            System.out.println("\t _____   \n" +
                                    "\t|     |\n" +
                                    "\t|     O\t\n" +
                                    "\t|     |\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "  __|__");
                            live--;
                            System.out.println("Lives: " + live);
                            break;
                        case 4:
                            System.out.println("\t _____   \n" +
                                    "\t|     |\n" +
                                    "\t|     O\t\n" +
                                    "\t|    /|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "  __|__");
                            live--;
                            System.out.println("Lives: " + live);
                            break;
                        case 3:
                            System.out.println("\t _____   \n" +
                                    "\t|     |\n" +
                                    "\t|     O\t\n" +
                                    "\t|    /|\\\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "  __|__");
                            live--;
                            System.out.println("Lives: " + live);
                            break;
                        case 2:
                            System.out.println("\t _____   \n" +
                                    "\t|     |\n" +
                                    "\t|     O\t\n" +
                                    "\t|    /|\\\n" +
                                    "\t|    /\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "  __|__");
                            live--;
                            System.out.println("Lives: " + live);
                            break;
                        case 1:
                            System.out.println("\t _____   \n" +
                                    "\t|     |\n" +
                                    "\t|     O\t\n" +
                                    "\t|    /|\\\n" +
                                    "\t|    / \\\n" +
                                    "\t|\n" +
                                    "\t|\n" +
                                    "  __|__");
                            live--;
                            System.out.println("Lives: " + live);
                            break;
                    }
                } else {
                    letterFound = false;
                }
                System.out.println(finalWord);

                if(live == 0) {
                    System.out.println("YOU LOST");// || finalWord.toString().contains("*")
                    gameProccessed = false;
                } else if (!Arrays.toString(finalWord).contains("*")){
                    System.out.println("YOU WIN");
                    gameProccessed = false;
            }
            }
        } else {
            System.exit(0);
        }
    }

    private static char[] createArrayWord(String word) {
        int countLetters = word.length();
        char[] finalWord = new char[countLetters];
        for(int i = 0; i < countLetters; i++) {
            finalWord[i] = '*';
        }
        return finalWord;
    }

    private static void  gallowPrinter(boolean letterFound) {

    }

    private static void menu() {
        System.out.println("Start the game?");
        System.out.println("1.Yes");
        System.out.println("2.No");
    }

    private static int getRandomNumber(){
        return (int) (Math.random() * 50);
    }

    private static final String[] words = {
            "sunglasses", "chair", "airplane", "dog", "laboratory",
            "tiger", "window", "pyramid", "rocket", "bicycle",
            "computer", "penguin", "house", "backpack", "elephant",
            "crystal", "adventure", "vampire", "whisper", "flower",
            "alligator", "mountain", "guitar", "chocolate", "microscope",
            "sun", "submarine", "volcano", "tree", "cat",
            "rainbow", "treasure", "castle", "dragon", "horizon",
            "umbrella", "forest", "cloud", "parachute", "compass",
            "diamond", "jungle", "apple", "helicopter", "skeleton",
            "pencil", "planet", "car", "universe", "sandwich"
    };

}
