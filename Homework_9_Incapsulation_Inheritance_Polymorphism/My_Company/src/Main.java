import com.example.employees.Designer;
import com.example.employees.Developer;
import com.example.employees.Employee;
import com.example.employees.Manager;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Manager("Nick Craig", 29, 3500),
                new Designer("Robert Dawson", 36, 3100),
                new Designer("Maria Fox", 29, 2800),
                new Developer("Daniel Reed", 40, 3500),
                new Developer("Anhel Rodriges", 34, 3000),
                new Developer("Carla Mancini", 43, 3000),
                new Developer("Aleks Damn", 35, 3000)
        };
        for (Employee employee : employees) {
            employee.employeeInfo();
            employee.describeRole();
            employee.describeRole("");
            System.out.println("*******************************************");
        }


    }
}