package calculator;

public class CalculatorController {
    public int add(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("빈 문자열이 입력되었습니다.");
        }

        String delimiter = ",|:";
        String[] numbers = input.split(delimiter);
        return sumNumbers(numbers);
    }

    private int sumNumbers(String[] numbers) {
        return 0;
    }
}
