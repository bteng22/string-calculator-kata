/**
 * Created by brandonteng on 12/14/14.
 */
public class StringCalculator {
    public int add(String input) {
        String[] numbers = input.split(",|\n");

        if (input.isEmpty()) {
            return 0;
        } else if (numbers.length > 1) {
            return getSum(numbers);
        }
        return getInt(input);
    }

    private int getSum(String[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += getInt(numbers[i]);
        }
        return sum;
    }

    private int getInt(String number) {
        return Integer.parseInt(number);
    }

}
