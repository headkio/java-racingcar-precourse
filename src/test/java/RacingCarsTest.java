import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarsTest {

    @Test
    public void moveCars() {
        RacingCar testCar = new RacingCar("testCar");

        RacingCars racingCars = new RacingCars();
        racingCars.addRacingCar(testCar);
        racingCars.moveCars();

        if (testCar.getMoveDistance() != 0) {
            assertThat(testCar.getMoveDistance()).isGreaterThanOrEqualTo(RacingCar.MIN_DISTANCE_FOR_MOVE);
        }
    }

    @Test
    public void getWinners() {
        RacingCar testCar1 = new RacingCar("testCar1");
        RacingCar testCar2 = new RacingCar("testCar2");
        RacingCar testCar3 = new RacingCar("testCar3");
        RacingCar testCar4 = new RacingCar("testCar4");

        testCar1.setMoveDistance(7);
        testCar2.setMoveDistance(8);
        testCar3.setMoveDistance(5);
        testCar4.setMoveDistance(8);

        RacingCars racingCars = new RacingCars();
        racingCars.addRacingCar(testCar1);
        racingCars.addRacingCar(testCar2);
        racingCars.addRacingCar(testCar3);
        racingCars.addRacingCar(testCar4);

        List<RacingCar> racingCarList = racingCars.getWinners();

        assertThat(racingCarList).extracting("carName")
                .containsExactly("testCar2", "testCar4");
    }
}