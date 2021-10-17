package calculator;

class StringCalculator {

	public int add(String input) {
		if (input.equals("")) {
			return 0;
		} else if (input.contains(",")) {
			String[] numbers = input.split(",");
			return toInt(numbers[0]) + toInt(numbers[1]);
		} else
			return 1;
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}
}
