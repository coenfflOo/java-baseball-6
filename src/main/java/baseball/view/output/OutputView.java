package baseball.view.output;

import static baseball.view.constant.OutputMessage.*;

public final class OutputView extends OutputWriter {
    private OutputView() {
    }

    public static void printStartMessage() {
        printMessageResponse(BASEBALL_START);
    }
}