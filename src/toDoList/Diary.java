package toDoList;

import java.util.ArrayList;
import java.util.Collections;

public class Diary {

    private ArrayList<Job> Jobs;

    public void sortJobs () {
        Collections.sort (this.Jobs);
    }

    public void printDiary () {
        if (this.Jobs.isEmpty()) {
            System.out.println("No jobs have been entered.");
        }
        else {
            for (Job other : Jobs) {
                other.printFormatted();
            }
        }
    }



}
