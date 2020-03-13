package testing;

public class SpeedReading {

    public SpeedReading() {
    }

    public int parseSpeedReading(String x) {
        String remainder = x.substring(1);
        int i = Integer.parseInt(remainder.trim());
        return i;
    }
}
