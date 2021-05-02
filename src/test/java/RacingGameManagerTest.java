import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameManagerTest {

    @Test
    void setRacingCars() {
        RacingGameManager racingGameManager = new RacingGameManager();
        String[] carNames = {"pobi","crong","honux"};
        racingGameManager.setRacingCars(carNames);
        RacingCars racingCars = racingGameManager.getRacingCars();

        assertThat(racingCars.getRacingCars()).extracting("carName")
                .containsExactly("pobi","crong","honux");
    }

    @Test
    void setMoveCount() {
        RacingGameManager racingGameManager = new RacingGameManager();
        racingGameManager.setMoveCount(9);
        assertThat(racingGameManager.getMoveCount()).isEqualTo(9);
    }
}