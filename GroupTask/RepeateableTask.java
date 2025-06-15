package GroupTask;

public class RepeateableTask extends Task {
    private final int repeatCount;
    private final String repeatTime;

    public RepeateableTask(String name, String description, String creator, int repeatCount, String repeatTime) {
        super(name, description, creator);
        this.repeatCount = repeatCount;
        this.repeatTime = repeatTime;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Repeat Count: " + repeatCount);
        System.out.println("Repeat Time: " + repeatTime);
    }
}
