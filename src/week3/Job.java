package week3;

// This program mst print a list of all jobs, sort the jobs into order of priority, print only those jobs in a certain string
// and remove completed jobs
public class Job {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void markComplete(boolean complete) {
        this.complete = complete;
    }

    public String display() {
        if (this.isComplete())
            return String.format(getName(), getDescription(), getPriority(), "finished");
        else {
            return String.format(getName(), getDescription(), getPriority());
        }
    }

    @Override
    public int compareTo (Job other) {
        if ( other.getPriority() != this.getPriority()) {
            return other.getPriority() - this.getPriority();
        }
        else {
            return this.getPriority() - other.getPriority();
        }
    }
    // Google CompareTo
}
