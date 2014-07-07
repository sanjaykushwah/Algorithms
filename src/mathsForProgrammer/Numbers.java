package mathsForProgrammer;

public class Numbers {
	public String numberToBaseString(int number, int base) {
		if (number < base) {
			return Integer.toString(number);
		} else {
			String output = Integer.toString(number % base);
			int reducedNumber = (number - Integer.parseInt(output)) / base;
			String restOfString = numberToBaseString(reducedNumber, base);
			return restOfString + output;
		}

	}

	public int baseStringToValue(String number, int base) {

		if (number.isEmpty()) {
			return 0;
		} else {
			int output = Integer.parseInt(Character.toString(number
					.charAt(number.length() - 1)));
			String remainingString = number.substring(0, number.length() - 1);
			String valueOfRemainingString = Integer.toString(baseStringToValue(
					remainingString, base));
			output += base * Integer.parseInt(valueOfRemainingString);
			return output;
		}
	}

	public static void main(String[] args) {
		Numbers num = new Numbers();
		System.out.println(num.numberToBaseString(8023, 2));
		System.out.println(num.baseStringToValue("1111101010111", 2));
	}
}
