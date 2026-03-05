import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while(true) {
            showMenu();
            int user_input = sc.nextInt();

            switch (user_input) {
                case 1: 
                    List<ToDoItem> tasks = toDoList.getAllTask();
                    for (ToDoItem item : tasks) {
                        System.out.println(item);
                    }
                    break;
                
                case 2:
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Description: ");
                    String description = sc.nextLine();
                    toDoList.addTask(title, description);
                    break;         
                
                case 3:
                    System.out.print("Enter the task id that you want to remove: ");
                    int removeId = sc.nextInt();
                    toDoList.removeTask(removeId);
                    break;

                case 4:
                    System.out.print("Enter the task id that you want to change its status: ");
                    int toggleId = sc.nextInt();
                    if (toDoList.toggleTask(toggleId)) {
                        System.out.println("Status changed!");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                
                case 0:
                    System.out.println("Closing this program...");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid input.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("=== ToDo App ===");
        System.out.println("1. Show all Tasks");
        System.out.println("2. Add new task");
        System.out.println("3. Remove task");
        System.out.println("4. Change task status");
        System.out.println("0. End this app");
        System.out.print("Select: ");
    }
}
