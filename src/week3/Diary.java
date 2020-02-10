package week3;

import java.util.ArrayList;
import java.util.Iterator;

public class Diary {

    private ArrayList<Job> jobs;

    public Diary() { this.jobs = new ArrayList<>(); }

    public void addJob (Job j) {
        this.jobs.add(j);
    }

    // Displays all current jobs
    public void printDiary() {
        if (this.jobs.isEmpty()) {
            System.out.println("No jobs have been specified.");
        }
        else {
            for (Job j : jobs ) {
                System.out.println(j.display());
            }
        }
    }

    public void purgeDiary() {
        Iterator<Job> it = jobs.iterator();
        while (it.hasNext()) {
            Job J = it.next();
            if ( J.isComplete()) {
                it.remove();
            }
        }
    }


}
