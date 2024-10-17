import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What currency do you want to convert?");
        System.out.println("1.RUB\n2.USD\n3.EUR\n4.CNY\n5.BYN");

        switch (scanner.nextInt()) {

        }
        System.out.println("Enter the amount in RUB");
        double amount = scanner.nextDouble();

        System.out.println("1.RUB to USD\n2.RUB to EUR\n3.RUB to CNY\n4.RUB to BYN");

        switch (scanner.nextInt()) {
            case 1:
                System.out.printf("%.2f", amount / CourseRUB.USD);
                break;
            case 2:
                System.out.printf("%.2f", amount / CourseRUB.EUR);
                break;
            case 3:
                System.out.printf("%.2f", amount / CourseRUB.CNY);
                break;
            case 4:
                System.out.printf("%.2f", amount / CourseRUB.BYN);
                break;
            default:
                break;
        }
    }

    public static void Convert() {

    }
}

class CourseRUB {
    public static final double USD = 97.26;
    public static final double EUR = 106.08;
    public static final double CNY = 13.59;
    public static final double BYN = 29.37;
}

class CourseUSD {

}

class CourseEUR {

}

class CourseCNY {

}

class CourseBYN {

}