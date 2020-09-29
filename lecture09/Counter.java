
public class Counter { // •• Testing R3.17 Provide a unit test class for the Counter class in Section 3.1.
	
	private int value;

	   // returns the current value
	   public int getValue()
	   {
	      return value;
	   }

	   // adds 1 to the counter
	   public void click() 
	   {
	      value = value + 1;
	   }

	   // reset to zero
	   public void reset()
	   {
	      value = 0;
	   }

	public static void main(String[] args) {
		Counter tally = new Counter();
	    tally.click();
	    tally.click();
	    int result = tally.getValue(); // Sets result to 2
	    
	    System.out.print("result: ");
	    System.out.println(result);
		
		
	}

}
