
public class Calculator {

	private final String delimeter = ",|\n";

	public int calculate(String input) throws Exception {

		String[] numbers = input.split(delimeter);

		if (isEmpty(input)) {
			return 0;
		}
		if (input.length() == 1) {
			return StringToInt(input);
		} else {
			return getSum(numbers);
		}

	}

	private int getSum(String[] numbers) throws Exception {
		findDangerousInput(numbers);

		return calculateValues(numbers);
	}

	private int calculateValues(String[] numbers) {
		int sum = 0;
		for (String current : numbers) {
			if (StringToInt(current) > 1000) {
				continue;
			}
			sum += StringToInt(current);

		}
		return sum;
	}

	private void findDangerousInput(String[] numbers) throws Exception {

		for (String current : numbers) {
			if (StringToInt(current) < 0) {
				throw new Exception("negative Input !!!");

			}
		}
	}

	private boolean isEmpty(String input) {
		// TODO Auto-generated method stub
		return input.isEmpty();
	}

	private int StringToInt(String input) {
		// TODO Auto-generated method stub
		return Integer.parseInt(input);
	}

}
