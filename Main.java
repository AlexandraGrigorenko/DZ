public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new People("Фунтик",2000, 3),
                new Cat("Рома",1000,5),
                new Robot("ИИ001",6000,1)};

        Obstacle[] obstacles = {new Treadmill(100), new Wall(2)};

        for (Competitor c:competitors ) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if(!c.isDistance()){
                    break;
                }
            }
        }

        for (Competitor c:competitors ) {
            c.info();
        }

    }
}
