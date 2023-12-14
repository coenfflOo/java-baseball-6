package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {
    private final List<Integer> computerNumber = new ArrayList<>();

    private ComputerNumber(List<Integer> computerNumber) {
        this.computerNumber.addAll(computerNumber);
    }

    public static ComputerNumber of(List<Integer> computerNumber) {
        return new ComputerNumber(computerNumber);
    }
}
