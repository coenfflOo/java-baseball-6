package baseball.view.constant;

public enum OutputMessage {
    BASEBALL_START("숫자 야구 게임을 시작합니다.");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}