public class RacingCar {
    public static int MIN_DISTANCE_FOR_MOVE = 4;

    private String carName;
    private int moveDistance;

    RacingCar (String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public void setMoveDistance(int moveDistance) {
        this.moveDistance = moveDistance;
    }

    public void move() {
        final int MIN_NUM = 0;
        final int MAX_NUM = 9;

        int moveDistance = (int)(Math.random() * (MAX_NUM - MIN_NUM)) + MIN_NUM;

        if (moveDistance >= MIN_DISTANCE_FOR_MOVE) {
            setMoveDistance(getMoveDistance() + moveDistance);
        }
    }
}