package GroupTask;

public class Task {
    protected String name;
    protected String description;
    protected String creator;

    public Task(String name, String description, String creator) {
        this.name = name;
        this.description = description;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void updateDescription(String newDescription) {
        this.description = newDescription;
    }

    public void printDetails() {
        System.out.println("Task Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Creator: " + creator);
    }
}
