import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

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