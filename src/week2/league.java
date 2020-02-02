package week2;

import java.util.ArrayList;

public class league {

    private ArrayList<team> rugbyTeam;

    public league() {
        this.rugbyTeam = new ArrayList<>();
    }

    public void addTeam (team newTeam) {
        this.rugbyTeam.add(newTeam);
    }


    public static void main(String[] args) {
        team helens = new team("St Helens");
        team hudds = new team("Huddersfield Giants");
        team hullkr = new team("Hull Kingston Rovers");
        team wigan = new team("Wigan Warriors");
        team castleford = new team("Castleford Tigers");
        team hull = new team("Hull FC");
        team leeds = new team("Leeds Rhinos");
        team toronto = new team("Toronto Wolfpack");
        team warrington = new team("Warrington Wolves");
        team wakefield = new team("Wakefield Trinity");
        team catalans = new team("Catalans Dragons");
        team salford = new team("Salford Red Devils");

        league rugbyLeague = new league();

        rugbyLeague.addTeam(helens);
        rugbyLeague.addTeam(hudds);
        rugbyLeague.addTeam(hullkr);
        rugbyLeague.addTeam(wigan);
        rugbyLeague.addTeam(castleford);
        rugbyLeague.addTeam(hull);
        rugbyLeague.addTeam(leeds);
        rugbyLeague.addTeam(toronto);
        rugbyLeague.addTeam(warrington);
        rugbyLeague.addTeam(wakefield);
        rugbyLeague.addTeam(catalans);
        rugbyLeague.addTeam(salford);

    }

}
