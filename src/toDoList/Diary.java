// The Diary class takes multiple Jobs that the user has input, and puts them into an arrayList
// The sole job for the Diary class is to print the list of Jobs

package toDoList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Diary {

    private ArrayList<Job> jobs = new ArrayList<>();

    public Diary() {}

    public void addJob (Job newJob) {
        jobs.add(newJob);
    }

    public void sortJobs () {
        Collections.sort (this.jobs);
    }

    public void printDiary () {
        if (this.jobs.isEmpty()) {
            System.out.println("No jobs have been entered.");
        }
        else {
            for (Job j : jobs) {
                j.printFormatted();
            }
        }
    }

    public void searchDiary (String search) {

    }
    public void purgeDiary () {
        jobs.removeIf(Job::isComplete);
        }


    public static void main(String[] args) {

        Job work = new Job("Finish work", "Finish any work that is incomplete", 5, false);
        Job walk = new Job("Go for a walk", "Go out for a walk and relax.", 2, false);
        Job room = new Job("Clean room", "Clean your room", 3, false);
        Job kitchen = new Job("Clean Kitchen", "Clean the kitchen", 4, false);
        Job read = new Job("Read a book", "Read 10 pages of a book", 1, false);

        Diary myDiary = new Diary();

        myDiary.addJob(work);
        myDiary.addJob(walk);
        myDiary.addJob(room);
        myDiary.addJob(kitchen);
        myDiary.addJob(read);

        System.out.println(myDiary);
    }

}
