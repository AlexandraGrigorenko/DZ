public class People implements Competitor {

    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean active;

    public People(String name, int maxRunDistance,int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public People(String name) {
        this(name, 2000, 8);
    }

    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println( name + " справился с бегом");
        } else {
            System.out.println(name + " провалил бег");
            active = false;
        }

    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " справился с прыжком");
        } else {
            System.out.println(name + " не смог допрыгнуть");
            active = false;
        }
    }

    public boolean isDistance() {
        return active;
    }

    public void info() {
        System.out.println(name + " " + active);
    }
}
