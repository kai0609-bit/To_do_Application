import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class FileManager {
    private static final String FILE_NAME = "tasks.csv";

    // Method to save ToDoList into csv file.
    public void saveTasks(List<ToDoItem> tasks) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME);

            for (ToDoItem item : tasks) {
            fw.write(item.getId() + "," + item.getTitle() + "," + item.getDescription() + "," + item.isCompleted() + "\n");
            }
            fw.close();
        } catch(IOException e) {
            System.out.println("FAILED TO LOAD THE FILE");
        }
    };

    // Method to read csv file and retur it into ToDoList.
    public List<ToDoItem> loadTasks() {
        List<ToDoItem> tasks = new ArrayList<>();

        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return tasks; 
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                String description = parts[2];
                boolean isCompleted = Boolean.parseBoolean(parts[3]);
                tasks.add(new ToDoItem(id, title, description, isCompleted));
            }

            br.close();
        } catch(IOException e) {
            System.out.println("FAILED TO LOAD THE FILE.");
        }
        return tasks;
    };
}
