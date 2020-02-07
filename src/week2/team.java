package week2;

public class team implements Comparable <team> {

    private String name;

    private int won;
    private int lost;
    private int drawn;

    private int pointsFor;
    private int pointsAgainst;

    public team(String name) {
        this.name = name;
        this.won = 0;
        this.lost = 0;
        this.drawn = 0;
        this.pointsFor = 0;
        this.pointsAgainst = 0;
    }

    public String getName() { return name; }

    public int getWon() { return won; }

    public int getLost() { return lost; }

    public int getDrawn() { return drawn; }

    public int getPlayed() { return this.getWon() + this.getLost() + this.getDrawn(); }

    public int getPointsFor() { return pointsFor; }

    public int getPointsAgainst() { return pointsAgainst; }

    public int getDifference() { return this.getPointsFor() - this.getPointsAgainst(); }

    public int getPoints() { return this.getWon() * 2 + this.getDrawn(); }

    public void play (int ptsFor, int ptsAgainst ) {

        this.pointsFor += ptsFor;
        this.pointsAgainst += ptsAgainst;

        if (ptsFor > ptsAgainst) {
            this.won++;
        }
        else if (ptsFor < ptsAgainst) {
            this.lost++;
        }
        else {
            this.drawn++;
        }
    }

    @Override
    public int compareTo (team otherTeam) {

        if (otherTeam.getPoints() != this.getPoints()) {
            return otherTeam.getPoints() - this.getPoints();
        }
        else {
            return otherTeam.getDifference() - this.getDifference();
        }
    }

    public void printLeagueTable () {

        final String formatString = "%-22s %4d %4d %4d %4d %6d %6d %6d %4d";

        System.out.println(String.format(formatString, this.name,
                this.getPlayed(),
                this.getWon(), this.getLost() + this.getDrawn(),
                this.getPointsFor(), this.getPointsAgainst(),
                this.getDifference(),
                this.getPoints()));
        }
    }