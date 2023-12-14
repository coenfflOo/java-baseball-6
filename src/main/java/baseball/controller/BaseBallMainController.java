package baseball.controller;


import baseball.domain.BallNumber;
import baseball.domain.ComputerNumber;
import baseball.service.BaseballService;
import baseball.util.RandomNumberUtil;
import baseball.view.input.InputView;
import baseball.view.output.OutputView;

public class BaseBallMainController {
    private static ComputerNumber computerNumber;
    private static BallNumber ballNumber;
    private static BaseballService baseballService = new BaseballService();

    private BaseBallMainController(){
    }

    public static void start() {
        do {
            baseballGameGenerate();
            baseballGamePlay();
        } while (InputView.readRestartInfo());
    }

    private static void baseballGameGenerate() {
        OutputView.printStartMessage();
        computerNumber = ComputerNumber.of(RandomNumberUtil.getRandomNumber());
    }

    private static void baseballGamePlay() {
        do {
            ballNumber = InputView.readNumberInfo();
            baseballService.play(computerNumber, ballNumber);
        } while (!baseballService.isEnd());
        OutputView.printEndMessage();
    }

}
