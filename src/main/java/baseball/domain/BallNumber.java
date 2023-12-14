package baseball.domain;

import java.util.List;

public class BallNumber {
    private final List<Integer> ballNumber;

    private BallNumber(List<Integer> ballNumber) {
        this.ballNumber = ballNumber;
    }

    public static BallNumber of(List<Integer> ballNumber) {
        return new BallNumber(ballNumber);
    }

}
