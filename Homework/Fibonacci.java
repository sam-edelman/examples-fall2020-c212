import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
		int index = Integer.parseInt(args[0]);
		BigInteger number = Fibonacci.calc(index, new BigInteger("1"), new BigInteger("1") );
		System.out.println("The " + index + "-th Fibonacci number is: " + number);
		
		
	}
	
	public static BigInteger calc( int index, BigInteger older, BigInteger old) {
		if (index == 1) return older;
		if (index == 2) return old;
		return Fibonacci.calc(index - 1, old, old.add(older) );
		
	}

}
