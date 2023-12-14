package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {

    private final List<Integer> computerNumber;

    private ComputerNumber(List<Integer> computerNumber) {
        this.computerNumber = computerNumber;
    }

    public static ComputerNumber of(List<Integer> computerNumber) {
        return new ComputerNumber(computerNumber);
    }

    public List<Integer> getComputerNumber() {
        return computerNumber;
    }
}
