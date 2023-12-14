package baseball.view.output;

import baseball.view.constant.OutputMessage;

sealed class OutputWriter
        permits OutputView {

    OutputWriter() {
    }

    public static void println(Object object) {
        System.out.println(object);
    }

    public static void printMessageResponse(OutputMessage responseMessage) {
        println(responseMessage.getMessage());
    }
}