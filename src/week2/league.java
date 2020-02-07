package week2;

import java.util.ArrayList;
import java.util.Collections;

public class league {


    private ArrayList<team> rugbyTeam;

    public league() {
        this.rugbyTeam = new ArrayList<>();
    }

    public void addTeam (team newTeam) {
        this.rugbyTeam.add(newTeam);
    }

    public void sortTeam () {
        Collections.sort(this.rugbyTeam);
    }

    public void printTeam() {
        if (this.rugbyTeam.isEmpty()) {
            System.out.println("No teams in the league.");
        }
        else {
            for (team newTeam : rugbyTeam) {
                newTeam.printLeagueTable();
            }
        }
    }
}
