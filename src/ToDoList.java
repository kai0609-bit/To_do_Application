import java.util.List;
import java.util.ArrayList;

public class ToDoList {
    // Properties
    private List<ToDoItem> toDoList = new ArrayList<>();
    private int nextId = 1;

    // Constructors
        public ToDoList() {

    }
    
    public List<ToDoItem> getAllTask() {
        return toDoList;
    }

    public void addTask(String title, String description) {
        ToDoItem newTask = new ToDoItem(nextId, title, description, false);
        toDoList.add(newTask);
        nextId++;
    }

    public boolean removeTask(int id) {
        for (int i = 0; i < toDoList.size(); i++) {
            if (toDoList.get(i).getId() == id) {
                toDoList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean toggleTask(int id) {
        for (ToDoItem item : toDoList) {
            if (item.getId() == id) {
                item.toggleCompleted();
                return true;
            }
        }
        return false;
    }

    public ToDoItem getTaskById(int id) {
        for (ToDoItem item : toDoList) {
            if (item.getId() == id) return item;
        }
        return null;
    }
}

    

