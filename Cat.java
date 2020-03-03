public class Cat implements Competitor{
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println( name + " справился с бегом");
        } else {
            System.out.println( name + " провалил бег");
            onDistance = false;
        }

    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println( name + " справился с прыжком");
        } else {
            System.out.println( name + " не смог допрыгнуть");
            onDistance = false;
        }
    }

    public boolean isDistance() {
        return onDistance;
    }

    public void info() {
        System.out.println(name + " " + onDistance);
    }

}
