import java.util.*;

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

    public int inputMoveCount() {
        return 5;

        /*
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scanner = new Scanner(System.in);
        int moveCount = scanner.nextInt();
        return moveCount;
         */
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public int getMoveCount() {
        return this.moveCount;
    }

    private void printResult() {
        final String CAR_NAME_SPERATOR = ", ";

        List<RacingCar> winnerList  = racingCars.getWinners();
        String winnerNames = "";

        for (RacingCar winner : winnerList) {
            winnerNames += (winner.getCarName() + CAR_NAME_SPERATOR);
        }

        winnerNames = winnerNames.substring(0, winnerNames.lastIndexOf(CAR_NAME_SPERATOR));
        System.out.println(winnerNames + " 가 최종 우승했습니다.");
    }

    public void start() {
        String[] carNames = inputRacingCars();
        setRacingCars(carNames);

        int moveCount = inputMoveCount();
        setMoveCount(moveCount);

        for (int i = 0; i < moveCount; i++) {
            racingCars.moveCars();
            racingCars.printLocation();
        }

        printResult();
    }
}