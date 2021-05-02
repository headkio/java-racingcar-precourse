import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class RacingCars {
    List<RacingCar> racingCars = new ArrayList<RacingCar>();

    public List<RacingCar> getRacingCars() {
        return this.racingCars;
    }

    public void addRacingCar(RacingCar racingCar) {
        racingCars.add(racingCar);
    }

    public void moveCars() {
        for (RacingCar racingCar : racingCars) {
            racingCar.move();
        }
    }

    public void printLocation() {
        for (RacingCar racingCar : racingCars) {
            System.out.print(racingCar.getCarName() + " : " + racingCar.getMoveDistanceWithDash());
        }
    }

    public List<RacingCar> getWinners() {
        if (racingCars.size() == 0) {
            return null;
        }

        List<RacingCar> winnerList = new ArrayList<RacingCar>();
        Collections.sort(racingCars);

        for (RacingCar racingCar : racingCars) {
            addWinner(winnerList, racingCar);
        }

        return winnerList;
    }

    private  void addWinner(List<RacingCar> winnerList, RacingCar racingCar) {
        int winnerDistance = racingCars.get(0).getMoveDistance();

        if (racingCar.getMoveDistance() == winnerDistance) {
            winnerList.add(racingCar);
        }
    }
}