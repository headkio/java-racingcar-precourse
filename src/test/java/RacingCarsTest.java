import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarsTest {

    @Test
    public void moveCars() {
        RacingCars racingCars = new RacingCars();
        RacingCar testCar = new RacingCar("testCar");
        racingCars.addRacingCar(testCar);
        racingCars.moveCars();

        if (testCar.getMoveDistance() != 0) {
            assertThat(testCar.getMoveDistance()).isGreaterThanOrEqualTo(RacingCar.MIN_DISTANCE_FOR_MOVE);
        }
    }
}
