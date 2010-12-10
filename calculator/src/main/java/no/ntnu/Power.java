package no.ntnu;
public class Power {
	public static int power(int base, int power){
		int result = base;
		for(int i = 1; i < power; i++){
			result = Multiplication.multiply(result, base);
		}
		return result;
	}
}
