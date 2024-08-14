import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, IOException {

//        CircusPerformer fireman = new CircusPerformer("Dred", "Performance with fire", 12);
//        CircusPerformer clown = new CircusPerformer("Jack", "Make people lough", 5);
//        CircusPerformer clown2 = new CircusPerformer("Mike", "An assistant of Dred", 1);
//        CircusPerformer juggler = new CircusPerformer("Leny", "Juggling various objects", 4);
        Circus<CircusPerformer> myCircus = new Circus<>();
        myCircus.loadFromFile("Aleks.txt");
//        myCircus.addPerformer(man);
//        myCircus.addPerformer(clown);
//        myCircus.addPerformer(clown2);
//        myCircus.addPerformer(juggler);
//        myCircus.removePerformer(man);
//        myCircus.saveToFile("My_Circus.txt");
//        myCircus.loadFromFile("My_Circus.txt");
//        myCircus.listPerformers();
//        clown2.getInfoPerformer();

//        for (Method method : man.getClass().getDeclaredMethods()) {
//            if (method.isAnnotationPresent(RunImmediately.class)) {
//                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
//                for (int i = 0; i < annotation.times(); i++) {
//                    method.invoke(man);
//                }
//            }
//        }


    }

}

