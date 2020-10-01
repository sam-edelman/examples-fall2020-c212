import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//int n = Integer.parseInt(args[0]); 
	    System.out.println(" 1 + 2 + ... + " + n + " = " + Summation.sum(n) + " = " + n + " * (" + n + " + 1) / 2 = " + (n * (n+1)/ 2));
	    
		System.out.println("");
	    System.out.println(" 1^2 + 2^2 + ... + " + n + "^2 = " + Summation.sumSquares(n) + " = " + n + " * (" + n + " + 1) / 2 = " + (n * (n+1)*(2*n+1)/ 6));
	    
	    System.out.println("");
	    System.out.println(" 1^3 + 2^3 + ... + " + n + "^3 = " + Summation.sumCubes(n) + " = " + n + "^2 * (" + n + " + 1)^2 / 4 = " + (n * n * (n+1)*(n+1)/ 4));
	    
	    scan.close();
	}

	
	
	public static int sum(int n) {
		return sumAPS(n, 0, 0);
	    // add code here 
	  }
	
	public static int sumAPS(int n, int start, int sum) {
		System.out.println("At index: " + start + " sum becomes: " + sum + " + " + start + " that is " + (sum + start));
		if(n == start) {
			return sum;
		}
		else {
			return sumAPS(n, start+1, sum + start);
		}
	}
	
	public static int sumSquares(int n) {
		return sumSquaresAPS(n,0,0);
	}
	
	public static int sumSquaresAPS(int n, int start, int sum) {
		System.out.println("At index: " + start + " sum becomes: " + sum + " + " + start + "^2 that is " + (sum + start*start));
		if(n == start) {
			return sum + start*start;
		}
		else {
			return sumSquaresAPS(n, start+1, sum + start*start);
		}
	}
	
	public static int sumCubes(int n) {
		return sumCubesAPS(n,0,0);
	}
	
	public static int sumCubesAPS(int n, int start, int sum) {
		System.out.println("At index: " + start + " sum becomes: " + sum + " + " + start + "^3 that is " + (sum + start*start*start));
		if(n == start) {
			return sum + start*start*start;
		}
		else {
			return sumCubesAPS(n, start+1, sum + start*start*start);
		}
	}
	
	


}
