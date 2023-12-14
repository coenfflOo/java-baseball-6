package baseball.view.constant;

public enum InputMessage {
    REQUEST_NUMBER("숫자를 입력해주세요 : ");
    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
