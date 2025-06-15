package GroupTask;

import java.time.LocalDateTime;

public class LimitedTimeTask extends Task {
    private LocalDateTime deadline;

    public LimitedTimeTask(String name, String description, String creator, LocalDateTime deadline) {
        super(name, description, creator);
        this.deadline = deadline;
    }

    public void updateDeadline(LocalDateTime newDeadline) {
        this.deadline = newDeadline;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Deadline: " + deadline);
    }
}
