package baseball.util;

import static baseball.exception.ErrorCode.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final int SIZE_OF_NUMBER = 3;
    private static final Pattern REGEX_NUMBER_PATTERN = Pattern.compile("^[0-9]*$");
    private static final Pattern REGEX_RESTART_PATTERN = Pattern.compile("^[1-2]*$");
    // Default Constructor
    private Parser() {
    }

    //== Business Logic ==//
    public static List<Integer> parseInput(String input) {
        INVALID_BLANK.validate(() -> hasWhitespace(input));
        INVALID_RANGE.validate(() -> isInvalidNumberPattern(input));
        return splitInput(input);
    }

    public static boolean parseRestartInput(String input) {
        INVALID_BLANK.validate(() -> hasWhitespace(input));
        INVALID_RESTART.validate(() -> isInvalidRestartPattern(input));
        return input.equals("1");
    }

    //== Split Method ==//
    private static List<Integer> splitInput(String input) {
        Set<Integer> numberSet = new LinkedHashSet<>();
        String[] str = input.split("");
        INVALID_LENGTH.validate(() -> isInvalidInputs(str));
        for (String number : str) {
            numberSet.add(Integer.valueOf(number));
        }
        INVALID_DUPLICATE.validate(() -> isInvalidSize(numberSet));
       return List.copyOf(numberSet);
    }


    //== Validation Method ==//
    // 빈칸을 가지고 있는가
    private static boolean hasWhitespace(String input) {
        return input.chars().anyMatch(Character::isWhitespace);
    }

    // 패턴에 맞는가
    private static boolean isInvalidNumberPattern(String input) {
        return matchWithRegex(input, REGEX_NUMBER_PATTERN);
    }

    // input Number의 갯수가 3개인가
    private static boolean isInvalidInputs(String[] str) {
        return str.length != SIZE_OF_NUMBER;
    }

    // set의 갯수가 3개인가
    private static boolean isInvalidSize(Set<Integer> numberSet) {
        return numberSet.size() != SIZE_OF_NUMBER;
    }

    private static boolean isInvalidRestartPattern(String input) {
        return matchWithRegex(input, REGEX_RESTART_PATTERN);
    }

    // == 정규표현식 제약 조건== //
    private static boolean matchWithRegex(String input, Pattern regex) {
        Matcher matcher = regex.matcher(input);
        return !matcher.matches();
    }


}