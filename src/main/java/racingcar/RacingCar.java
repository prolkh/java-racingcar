package racingcar;

import java.util.Random;
import java.util.Scanner;

public class RacingCar {

    public static final int BOUND = 10;
    public static final int PROCEEDING_NUM = 4;

    public static final Random random = new Random();

    public static void inputView() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("자동차 대수는 몇 대 인가요?");
        String carCount = scanner.nextLine();

        System.out.println("시도할 회수는 몇 회 인가요?");
        String trialCount = scanner.nextLine();

        System.out.println("carCount = " + carCount);
        System.out.println("trialCount = " + trialCount);
    }

    public static int proceed(int number) {
        return number >= PROCEEDING_NUM ? 1 : 0;
    }

    public static int getRandomNumber() {
        return random.nextInt(BOUND);
    }
}
