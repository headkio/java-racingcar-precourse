import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {
    @Test
    public void getMoveDistanceWithDash() {
        RacingCar testCar = new RacingCar("testCar");
        testCar.setMoveDistance(5);
        String distanceWithDash = testCar.getMoveDistanceWithDash();

        assertThat(distanceWithDash).isEqualTo("-----");
    }
}