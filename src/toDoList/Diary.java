// The Diary class takes multiple jobs that the user has input, and puts them into an arrayList
// The sole job for the Diary class is to print the list of jobs

package toDoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Diary {


    private ArrayList<Job> jobs = new ArrayList<>();

    public Diary(){}

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

    public void purgeDiary () {
        jobs.removeIf(Job::isComplete);
    }

    public void searchDiary (String search) {
        for (Job j : jobs) {
            if (j.getName().toLowerCase().contains(search.toLowerCase())) {
                j.printFormatted();
            }
        }
    }

    private void printTableHeader(){
        final String header = "%-25s %-40s %4s %20s";
        System.out.println(String.format(header, "Name", "Description", "Priority", "Complete?"));
    }

    public static void main(String[] args) {
        Diary newDiary = new Diary();

        Job walk = new Job("Go for a walk", "Take a walk and relax.", 4, true);
        Job work = new Job("Finish University work", "Finish incomplete work", 5, false);
        Job read = new Job("Read a book", "Read a few pages of your favourite book", 1, false);
        Job room = new Job("Clean your room", "Make your room nice and tidy", 3, false);
        Job kitchen = new Job("Clean the kitchen", "Clean the oven, floor and sink", 2, false);

        newDiary.addJob(walk);
        newDiary.addJob(work);
        newDiary.addJob(read);
        newDiary.addJob(room);
        newDiary.addJob(kitchen);

        newDiary.sortJobs();

        newDiary.printTableHeader();
        System.out.println();
        newDiary.purgeDiary();
        newDiary.printDiary();
        System.out.println("Searching:");
        newDiary.searchDiary("Clean");
    }
}
