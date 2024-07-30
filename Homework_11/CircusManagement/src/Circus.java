import java.io.*;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

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

    }

    public void loadFromFile(String filename) throws IOException {
//        1.Читаємо файл,назву якого ми задаємо в параметрі методу
//        2.Зчитуємо в файлі кожен рядок окремо в циклі при умові в 3 елементи на рядок(масив)
//        3.Присвоюємо кожен елемент рядка(масива) в змінну конструктора
//        4.Закриваємо Reader

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] fs = line.split(",");
            if (fs.length == 3) {
                String name = fs[0];
                String act = fs[1];
                int experience = Integer.parseInt(fs[2]);
                CircusPerformer performer = new CircusPerformer(name, act, experience);
            }
            reader.close();

        }
    }
}
