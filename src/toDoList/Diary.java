// The Diary class takes multiple Jobs that the user has input, and puts them into an arrayList
// The sole job for the Diary class is to print the list of Jobs

package toDoList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Diary {

    private ArrayList<Job> Jobs;

    public void addJob (Job j) {
        this.Jobs.add(j);
    }

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

    public void purgeDiary () {
        Iterator<Job> it = Jobs.iterator();
            while(it.hasNext()) {
                Job j = it.next();
                if(j.isComplete()) {
                    it.remove();
                }
            }
        }

    public void searchDiary (String search)
    {
        boolean found = false;
        for (Job j: this.Jobs) {
            if (j.getDescription().contains(search)) {
                System.out.println(j);
                found = true;
            }
        }
        return found;
    }


}
