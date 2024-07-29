import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        CircusPerformer man = new CircusPerformer("Ded", "dfsdfds", 22);
        CircusPerformer clown = new CircusPerformer("Jack", "dgdg", 5);
        CircusPerformer clown2 = new CircusPerformer("Mike", "ututyu", 1);
        CircusPerformer juggler = new CircusPerformer("Leny","Juggling various objects",4);
        Circus<CircusPerformer> myCircus = new Circus<>();

        myCircus.addPerformer(man);
        myCircus.addPerformer(clown);
        myCircus.addPerformer(clown2);
        myCircus.addPerformer(juggler);
        myCircus.removePerformer(man);
        myCircus.saveToFile("My Circus.txt");
    }

}

