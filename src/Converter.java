import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j;

        double[][] arr = {{0.010372, 0.009537, 0.074277, 0.009537}, //RUB
                {96.42, 0.92081, 7.1, 3.31}, //USD
                {104.86, 1.09, 7.71, 3.6}, //EUR
                {13.46, 0.140803, 0.129653, 0.46569}, //CNY
                {29.35, 0.301941, 0.278087, 2.15}}; //BYN

        System.out.println("What currency do you want to convert?");
        System.out.println("1.RUB\n2.USD\n3.EUR\n4.CNY\n5.BYN");

        switch (i = scanner.nextInt()) {
            case 1:
                System.out.println("1.RUB to USD\n2.RUB to EUR\n3.RUB to CNY\n4.RUB to BYN");
                break;
            case 2:
                System.out.println("1.USD to RUB\n2.USD to EUR\n3.USD to CNY\n4.USD to BYN");
                break;
            case 3:
                System.out.println("1.EUR to RUB\n2.EUR to USD\n3.EUR to CNY\n4.EUR to BYN");
                break;
            case 4:
                System.out.println("1.CNY to RUB\n2.CNY to USD\n3.CNY to EUR\n4.CNY to BYN");
                break;
            case 5:
                System.out.println("1.BYN to RUB\n2.BYN to USD\n3.BYN to EUR\n4.BYN to CNY");
                break;
            default:
                break;
        }
        j = scanner.nextInt();

        System.out.println("Enter the amount");
        double amount = scanner.nextDouble();

        System.out.printf("%.2f", amount * arr[i-1][j-1]);

    }

}
