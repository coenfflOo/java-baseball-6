package baseball.service;

import baseball.domain.BallNumber;
import baseball.domain.ComputerNumber;
import java.util.List;

public class BaseballService {
    private ComputerNumber computerNumber;
    private BallNumber ballNumber;

    public void play(ComputerNumber computerNumber, BallNumber ballNumber) {
        this.computerNumber = computerNumber;
        this.ballNumber = ballNumber;

        int strikes = countStrikes(ballNumber.getBallNumber(), computerNumber.getComputerNumber());
        int balls = countBalls(ballNumber.getBallNumber(), computerNumber.getComputerNumber());

        if (strikes == 0 && balls == 0) {
            System.out.println("낫싱");
        }
        if (balls > 0) {
            System.out.print(balls + "볼 ");
        }
        if (strikes > 0) {
            System.out.println(strikes + "스트라이크");
        }
    }

    private int countStrikes(List<Integer> input, List<Integer> target) {
        int strikes = 0;
        for (int i = 0; i < target.size(); i++) {
            if (target.get(i).equals(input.get(i))) {
                strikes++;
            }
        }
        return strikes;
    }

    private int countBalls(List<Integer> input, List<Integer> target) {
        int balls = 0;
        for (int i = 0; i < target.size(); i++) {
            if (target.contains(input.get(i))&&!target.get(i).equals(input.get(i))) {
                balls++;
            }
        }
        return balls;
    }

    public boolean isEnd() {
        return countStrikes(ballNumber.getBallNumber(), computerNumber.getComputerNumber()) == 3;
    }
}

