import com.example.employees.Designer;
import com.example.employees.Developer;
import com.example.employees.Employee;
import com.example.employees.Manager;

public class Main {
    public static void main(String[] args) {

        Employee nickCraig = new Manager("Nick Craig",29,3500);
        Employee robertDawson = new Designer("Robert Dawson",36,3100);
        Employee mariaFox = new Designer("Maria Fox",29,2800);
        Employee danielReed = new Developer("Daniel Reed",40,3500);
        Employee anhelRodriges = new Developer("Anhel Rodriges",34,3000);
        Employee carlaMancini = new Developer("Carla Mancini",43,3000);
        Employee aleksDamn = new Developer("Aleks Damn",35,3200);


    }
}