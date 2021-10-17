package calculator;

class StringCalculator {

//	public int add(String input) {
//		if (input.equals("")) {
//			return 0;
//		} else if (input.contains(",")) {
//			String[] numbers = input.split(",");
//			return toInt(numbers[0]) + toInt(numbers[1]);
//		} else
//			return 1;
//	}
//
	private static int toInt(String number) {
		return Integer.parseInt(number);
	}
	
	public static int add(String text){
		  if(text.equals("")){
		    return 0;
		  }
		  else if(text.contains(",")){
		    return sum(splitNumbers(text));
		  }
		  else
		    return 1;
		}

		private static String[] splitNumbers(String numbers){
		  return numbers.split(",");
		}

		private static int sum(String[] numbers){
		  int total = 0;
		  for(String number : numbers){
		    total += toInt(number);
		  }
		  return total;
		}
}
