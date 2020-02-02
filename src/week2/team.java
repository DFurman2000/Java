package week2;

public class team {
    private String name;
    private int pointsFor;
    private int pointsAgainst;
    private int pointsDifference;
    private int won;
    private int lost;
    private int drawn;
    private int games;
    private int points;


    public team(String name) {
        this.name = name;
        this.pointsFor = 0;
        this.pointsAgainst = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointsFor() {
        return pointsFor;
    }

    public void setPointsFor(int pointsFor) {
        this.pointsFor = pointsFor;
    }

    public int getPointsAgainst() {
        return pointsAgainst;
    }

    public void setPointsAgainst(int pointsAgainst) {
        this.pointsAgainst = pointsAgainst;
    }

    public double difference() {
        pointsDifference = getPointsFor() - getPointsAgainst();
        return pointsDifference;
    }

    public int teamWon() {
        if (getPointsFor() > getPointsAgainst())
        {
            won = won + 1;
        }
        return won;
    }

    public int teamLost() {
        if (getPointsFor() < getPointsAgainst())
        {
            lost = lost + 1;
        }
        return lost;
    }

    public int teamDrawn() {
        if (getPointsFor() == getPointsAgainst())
        {
            drawn = drawn + 1;
        }
        return drawn;
    }

    public int numberOfGames() {
        games = won + lost + drawn;
        return games;
    }

    public int numberOfPoints() {
        points = (won * 2) + drawn;
        return points;
    }

}


