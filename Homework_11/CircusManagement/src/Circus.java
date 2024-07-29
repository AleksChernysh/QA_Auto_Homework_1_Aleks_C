import java.io.*;
import java.util.ArrayList;
import java.io.IOException;


public class Circus<T> {
    private ArrayList<T> performers = new ArrayList<>();


    public void addPerformer(T performer) {
        this.performers.add(performer);

    }

    public void removePerformer(T performer) {
        this.performers.remove(performer);
    }


    public void listPerformers() {
        System.out.println("This list of all our performers:");
        performers.forEach(worker -> System.out.println(worker));
        System.out.println("=================================");
    }

    public void saveToFile(String filename) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            for (T performer : performers) {
                CircusPerformer cp = (CircusPerformer) performer;
                String name = cp.getName();
                String act = cp.getAct();
                int experience = cp.getExperience();
                writer.write(name + "," + act + "," + experience + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        public void loadFromFile (String filename){
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            

//        1.Прочитати файл по рядках (в кожному рядку дані одного performer)
//        2.Записати дані кожного перформера в об'єкт типу CircusPerformer
//        3.Додати всіх перформерів до списку performers




        }

    }
}
