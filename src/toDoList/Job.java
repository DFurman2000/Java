package toDoList;

public class Job implements Comparable<Job> {
    private String name;
    private String description;
    private int priority;
    private boolean complete;

    public Job(String name, String description, int priority, boolean complete) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.complete = complete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public void markComplete() {
    }

    @Override
    public int compareTo (Job other) {
        if (other.getPriority() > this.getPriority()) {
            return 1;
        }
        else if (other.getPriority() < this.getPriority()){
            return -1;
        }
        else {
            return 0;
        }
    }
    // This sorts the priority in descending order

    public void printFormatted () {
        final String formatString = "%-25s %-40s %4s %20s";
        System.out.println(String.format(formatString, this.name, this.description,
                this.priority, this.complete));
    }
    // Prints the results as a table (kind of.)

    public String display () {
        if (this.isComplete())
            return String.format(getName(), getDescription(), getPriority(), "finished");
        else {
            return String.format(getName(), getDescription(), getPriority());
        }
    }
}
