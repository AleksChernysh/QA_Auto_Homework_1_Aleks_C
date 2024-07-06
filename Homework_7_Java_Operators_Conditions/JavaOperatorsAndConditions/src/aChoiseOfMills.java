import java.util.Scanner;
public class aChoiseOfMills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a kind of mills: ");
        System.out.println("Press 1 for main dishes");
        System.out.println("Press 2 for snacks");
        System.out.println("Press 3 for desserts");
        System.out.println("Press 4 for drinks");
        int typeOfMill = scanner.nextInt();
        switch (typeOfMill) {
            case 1:
                System.out.println(" The main dish is Golubci today");
                break;
            case 2:
                System.out.println("Today's snack is meat plate ");
                break;
            case 3:
                System.out.println("For dessert is pancakes with syrup");
                break;
            case 4:
                System.out.println("For drink we have juice");
                break;
            default:
                System.out.println("Please enter correct number");
                break;
        }
    }
}
