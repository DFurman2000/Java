package week2;


public class leagueTable {

    public static void main(String[] args) {
        league rugbyLeague = new league();

        team hudds = new team("Huddersfield Giants");
        team wigan = new team("Wigan Warriors");
        team hull = new team("Hull FC");
        team leeds = new team("Leeds Rhinos");

        rugbyLeague.addTeam(hudds);
        rugbyLeague.addTeam(wigan);
        rugbyLeague.addTeam(hull);
        rugbyLeague.addTeam(leeds);

        hudds.play(12,22);
        leeds.play(22,12);

        hudds.play(12,18);
        wigan.play(18,12);

        hull.play(0,34);
        wigan.play(34,0);

        leeds.play(10,10);
        wigan.play(10,10);

        rugbyLeague.sortTeam();

        System.out.println("Super League Table");
        System.out.println();

        rugbyLeague.printTeam();
    }


}
