package baseball.view.input;

import static baseball.exception.ErrorCode.INVALID_INPUT;

import baseball.domain.BallNumber;
import baseball.util.InputUtil;
import baseball.util.Parser;
import java.util.List;

public class InputView {
    public static BallNumber readNumberInfo() {
        try {
            final String input = InputUtil.readLine();
            final List<Integer> number = Parser.parseInput(input);
            return BallNumber.of(number);
        } catch (IllegalArgumentException exception) {
            System.out.println(INVALID_INPUT.getMessage());
            return readNumberInfo();
        }
    }

}