import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while(true) {
            System.out.println("1. Show All Task 2. Add new Task 3. Remove Task  4. End");
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
                    System.out.println("Enter the id that you want to remove: ");
                    int id = sc.nextInt();
                    toDoList.removeTask(id);
                    break;
                
                case 4:
                    System.out.println("Closing this program...");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid input.");
            }
            
        }
    }
}
