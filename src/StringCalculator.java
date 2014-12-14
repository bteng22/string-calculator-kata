/**
 * Created by brandonteng on 12/14/14.
 */
public class StringCalculator {
    public int add(String input) {
        String[] numbers = input.split(",");

        if (input.isEmpty()) {
            return 0;
        } else if (numbers.length > 1) {
            return getSum(numbers);
        }
        return getInt(input);
    }

    private int getSum(String[] numbers) {
        return getInt(numbers[0]) + getInt(numbers[1]);
    }

    private int getInt(String number) {
        return Integer.parseInt(number);
    }

}
