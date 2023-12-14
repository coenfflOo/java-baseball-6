package baseball.view.input;

import static baseball.exception.ErrorCode.INVALID_INPUT;
import static baseball.view.constant.InputMessage.*;

import baseball.domain.BallNumber;
import baseball.util.InputUtil;
import baseball.util.Parser;
import java.util.List;

public class InputView {
    private static int count;
    public static BallNumber readNumberInfo() {
//        try {
//            System.out.print(REQUEST_NUMBER.getMessage());
//            final String input = InputUtil.readLine();
//            final List<Integer> number = Parser.parseInput(input);
//            return BallNumber.of(number);
//        } catch (IllegalArgumentException exception) {
//            System.out.println(INVALID_INPUT.getMessage());
//            return readNumberInfo();
//        }
        try {
            System.out.print(REQUEST_NUMBER.getMessage());
            final String input = InputUtil.readLine();
            final List<Integer> number = Parser.parseInput(input);
            return BallNumber.of(number);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException(INVALID_INPUT.getMessage());
        }
    }

    public static boolean readRestartInfo() {
//        try {
//            System.out.println(REQUEST_RESTART.getMessage());
//            final String input = InputUtil.readLine();
//            return Parser.parseRestartInput(input);
//        } catch (IllegalArgumentException exception) {
//            System.out.println(INVALID_INPUT.getMessage());
//            return readRestartInfo();
//        }
        try {
            System.out.println(REQUEST_RESTART.getMessage());
            final String input = InputUtil.readLine();
            return Parser.parseRestartInput(input);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException(INVALID_INPUT.getMessage());
        }
    }
}