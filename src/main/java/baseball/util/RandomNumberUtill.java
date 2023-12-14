package baseball.util;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.*;
import java.io.*;
public class RandomNumberUtill {

    public static List<Integer> getRandomNumber() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
