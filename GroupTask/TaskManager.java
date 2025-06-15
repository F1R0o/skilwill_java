package GroupTask;


import java.util.HashMap;

public class TaskManager {
    private final HashMap<String, Task> tasks = new HashMap<>();

    public void addTask(Task task) {
        if (tasks.containsKey(task.getName())) {
            return;
        }
        tasks.put(task.getName(), task);
    }

    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task task : tasks.values()) {
            task.printDetails();
            System.out.println("----------------------");
        }
    }

    public Task getTask(String name) {
        return tasks.get(name);
    }

    public boolean removeTask(String name) {
        return tasks.remove(name) != null;
    }
}
