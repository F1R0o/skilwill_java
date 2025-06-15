package GroupTask;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Show All Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Show One Task");
            System.out.println("0. Exit");
            System.out.print("Choose command: ");
            int command = Integer.parseInt(scanner.nextLine());

            if (command == 0) break;

            switch (command) {
                case 1:
                    System.out.print("Enter Task Type (Basic, Limited, Repeat): ");
                    String type = scanner.nextLine();
                    System.out.print("Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Task Description: ");
                    String desc = scanner.nextLine();

                    if (manager.getTask(name) != null) {
                        System.out.println("Task with this name already exists.");
                        break;
                    }

                    if (type.equalsIgnoreCase("Basic")) {
                        manager.addTask(new BasicTask(name, desc, username));
                    } else if (type.equalsIgnoreCase("Limited")) {
                        System.out.print("Enter deadline (yyyy-MM-ddTHH:mm): ");
                        LocalDateTime deadline = LocalDateTime.parse(scanner.nextLine());
                        manager.addTask(new LimitedTimeTask(name, desc, username, deadline));
                    } else if (type.equalsIgnoreCase("Repeat")) {
                        System.out.print("Repeat count: ");
                        int count = Integer.parseInt(scanner.nextLine());
                        System.out.print("Repeat time (e.g., daily, weekly): ");
                        String time = scanner.nextLine();
                        manager.addTask(new RepeateableTask(name, desc, username, count, time));
                    } else {
                        System.out.println("Unknown task type.");
                    }
                    break;

                case 2:
                    manager.printAllTasks();
                    break;

                case 3:
                    System.out.print("Enter Task Name to Update: ");
                    String updateName = scanner.nextLine();
                    Task taskToUpdate = manager.getTask(updateName);
                    if (taskToUpdate == null) {
                        System.out.println("Task not found.");
                        break;
                    }
                    System.out.print("New Description: ");
                    String newDesc = scanner.nextLine();
                    taskToUpdate.updateDescription(newDesc);

                    if (taskToUpdate instanceof LimitedTimeTask) {
                        System.out.print("New Deadline (yyyy-MM-ddTHH:mm): ");
                        ((LimitedTimeTask) taskToUpdate).updateDeadline(LocalDateTime.parse(scanner.nextLine()));
                    }
                    System.out.println("Task updated.");
                    break;

                case 4:
                    System.out.print("Enter Task Name to Delete: ");
                    String deleteName = scanner.nextLine();
                    if (manager.removeTask(deleteName)) {
                        System.out.println("Task deleted.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Task Name to Show: ");
                    String showName = scanner.nextLine();
                    Task showTask = manager.getTask(showName);
                    if (showTask != null) {
                        showTask.printDetails();
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                default:
                    System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }
}
