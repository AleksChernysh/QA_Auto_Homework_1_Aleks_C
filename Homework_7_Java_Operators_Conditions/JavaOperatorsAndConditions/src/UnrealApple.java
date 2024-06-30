import java.util.Scanner;
public class UnrealApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter current time(0-23):");
        int hour = scanner.nextInt( );

        if (hour >=6 && hour <12) {
            System.out.println("Congrats, You've got +10 energy");
        } else if (hour >= 12 && hour < 18 ) {
            System.out.println("Congrats, You've got +20 energy");
        } else if (hour >= 18 && hour < 24 ) {
            System.out.println("Congrats, You've got +30 energy");
        } else if (hour >= 0 && hour < 6 ) {
            System.out.println("Congrats, You've got +5 energy");
        }else {
            System.out.println("PLEASE ENTER A VALID TIME");
        }

    }
}
