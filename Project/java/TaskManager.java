package Project.java;
import java.util.*;
class TaskManager {
    private ArrayList<Task> tasks;
    private int taskIdCounter;

    // Constructor
    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.taskIdCounter = 1;
    }

    // Method to add a new task
    public void addTask(String title, String description, String priority, String status) {
        Task task = new Task(taskIdCounter, title, description, priority, status);
        tasks.add(task);
        taskIdCounter++;
        System.out.println("Task added successfully.");
    }

    // Method to edit an existing task
    public void editTask(int taskId, String title, String description, String priority, String status) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setTitle(title);
                task.setDescription(description);
                task.setPriority(priority);
                task.setStatus(status);
                System.out.println("Task updated successfully.");
                return;
            }
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    // Method to delete a task
    public void deleteTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == taskId) {
                tasks.remove(i);
                System.out.println("Task deleted successfully.");
                return;
            }
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    // Method to view all tasks
    public void viewAllTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Method to filter tasks by priority
    public void filterTasksByPriority(String priority) {
        for (Task task : tasks) {
            if (task.getPriority().equalsIgnoreCase(priority)) {
                System.out.println(task);
            }
        }
    }
}


