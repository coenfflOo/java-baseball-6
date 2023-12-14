package baseball.view.constant;

public enum OutputMessage {
    BASEBALL_START("숫자 야구 게임을 시작합니다."),
    BASEBALL_END("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}