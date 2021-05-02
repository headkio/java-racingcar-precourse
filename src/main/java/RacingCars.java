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
}
