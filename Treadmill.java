public class Treadmill extends Obstacle{
    int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
