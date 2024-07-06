import java.util.Scanner;

public class VisitOfaCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our cafe");
        int espresso;
        int latte;
        int cappuccino;
        while (true) {
            System.out.println("Enter amount of espresso: ");
            espresso = scanner.nextInt();
            espresso = espresso * 3;
            if (espresso < 0) {
                System.out.println("Please enter valid amount of espresso: ");
                continue;
            }
            System.out.println("Enter amount of latte: ");
            latte = scanner.nextInt();
            latte = latte * 4;
            if (latte < 0) {
                System.out.println("Please enter valid amount of latte: ");
                continue;
            }
            System.out.println("Enter amount of cappuccino: ");
            cappuccino = scanner.nextInt();
            cappuccino = cappuccino * 5;
            if (cappuccino < 0) {
                System.out.println("Please enter valid amount of cappuccino: ");
                continue;
            }
            break;
        }
        int TotalPrice = espresso + latte + cappuccino;
        System.out.println("TOTAL PRICE = " + TotalPrice);
        System.out.println("THANK YOU FOR YOUR ORDER!!!");

    }
}


