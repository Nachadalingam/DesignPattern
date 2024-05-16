package Project.java;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        int choice;
        do {
            System.out.println("1. Add Task");
            System.out.println("2. Edit Task");
            System.out.println("3. Delete Task");
            System.out.println("4. View All Tasks");
            System.out.println("5. Filter Tasks by Priority");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter task priority (High/Medium/Low): ");
                    String priority = scanner.nextLine();
                    System.out.print("Enter task status (Pending/In Progress/Completed): ");
                    String status = scanner.nextLine();
                    taskManager.addTask(title, description, priority, status);
                    break;
                case 2:
                    System.out.print("Enter task ID to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter updated task title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter updated task description: ");
                    description = scanner.nextLine();
                    System.out.print("Enter updated task priority (High/Medium/Low): ");
                    priority = scanner.nextLine();
                    System.out.print("Enter updated task status (Pending/In Progress/Completed): ");
                    status = scanner.nextLine();
                    taskManager.editTask(editId, title, description, priority, status);
                    break;
                case 3:
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    taskManager.deleteTask(deleteId);
                    break;
                case 4:
                    taskManager.viewAllTasks();
                    break;
                case 5:
                    System.out.print("Enter priority to filter by (High/Medium/Low): ");
                    String filterPriority = scanner.nextLine();
                    taskManager.filterTasksByPriority(filterPriority);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}