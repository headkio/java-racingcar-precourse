import java.util.Scanner;

public class RacingGameManager {
    private int moveCount = 0;
    private RacingCars racingCars = new RacingCars();

    private String[] inputRacingCars() {
        String RACING_CAR_INPUT_DELIMITER = ",";

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] carNames = inputStr.split(RACING_CAR_INPUT_DELIMITER);
        scanner.close();

        return carNames;
    }

    public RacingCars getRacingCars() {
        return this.racingCars;
    }

    public void setRacingCars(String[] carNames) {
        for (String carName : carNames) {
            racingCars.addRacingCar(new RacingCar(carName));
        }
    }

    private void setMoveCount() {

    }

    private void setRanking() {

    }

    private void printCarLocations() {

    }

    private void printResult() {

    }

    public void start() {
        String[] carNames = inputRacingCars();
        setRacingCars(carNames);

        setMoveCount();

        //while (moveCount != 0) {
            // racingCars.moveCars();
            // setRanking(racingCars);
            // printCarLocations();
        //}

        printResult();
    }
}