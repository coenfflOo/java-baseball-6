package baseball.exception;

import java.util.function.BooleanSupplier;

public enum ErrorCode {
    INVALID_BLANK("빈칸은 존재할 수 없습니다."),
    INVALID_LENGTH("3자리의 숫자만 입력 가능합니다."),
    INVALID_DUPLICATE("중복된 숫자는 입력할 수 없습니다."),
    INVALID_RANGE("1~9 사이의 숫자만 입력 가능합니다."),
    INVALID_INPUT("잘못된 입력입니다."),
    INVALID_RESTART("1 또는 2만 입력 가능합니다.");

    public static final String ERROR_PREFIX = "[ERROR] ";
    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public void validate(BooleanSupplier condition) {
        if (isSameCondition(condition)) {
            throw BusinessException.from(this);
        }
    }

    private boolean isSameCondition(BooleanSupplier condition) {
        return condition.getAsBoolean();
    }

    public String getMessage() {
        return ERROR_PREFIX + message;
    }
}
