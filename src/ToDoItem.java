public class ToDoItem {
    // Properties
    private int id;
    private String title;
    private String description;
    private boolean isCompleted;

    // Constructors
    public ToDoItem (int id, String title, String description, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    // Getters
    public int getId() {return id; }
    public String getTitle() {return title; }
    public String getDescription() {return description; }
    public boolean isCompleted() {return isCompleted; }

    // Setters
    public void setTitle(String title) {this.title = title; }
    public void setDescription(String description) {this.description = description; }
    public void setCompleted(boolean isCompleted) {this.isCompleted = isCompleted; }

    // Display
    @Override
    public String toString() {
        String status = isCompleted ? "Completed" : "Not completed";
        return "[" + id + "] " + title + " - " + status;  
    }
}
