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

   }
}
