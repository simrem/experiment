package no.ntnu;

public class Multiplication {
	public static int multiply(int number1, int number2) {
		int result = 0;
		for(int i = 0; i < number1; i++){
			result = Addition.add(result, number2);
		}
		return result;
	}
}
