package baseball;

import baseball.controller.BaseBallMainController;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        BaseBallMainController.start();
        Console.close();
    }
}
