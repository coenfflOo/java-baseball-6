package baseball.controller;


import static baseball.exception.ErrorCode.ERROR_PREFIX;

import baseball.domain.ComputerNumber;
import baseball.util.RandomNumberUtill;
import baseball.view.output.OutputView;

public class BaseBallMainController {

    private BaseBallMainController(){
    }

    public static void start() {
        baseballGameGenerate();
    }

    private static void baseballGameGenerate() {
        OutputView.printStartMessage();
        ComputerNumber computerNumber = ComputerNumber.of(RandomNumberUtill.getRandomNumber());
    }

    private static void baseballGamePlay() {

    }

}
