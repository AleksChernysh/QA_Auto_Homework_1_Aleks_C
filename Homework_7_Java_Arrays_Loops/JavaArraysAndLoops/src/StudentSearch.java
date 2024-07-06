import java.util.Scanner;

public class StudentSearch {
    public StudentSearch() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number of studentID: ");


        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};
        int id = scanner.nextInt();
        for (int elem : studentIDs ) {
            if ( id == elem) {
                System.out.println("Your ID" + elem + "has found");
                break;
            }
        }
    }
}

//}
