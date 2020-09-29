
public class Student {
	String name; //  instance variable for students name initialized as an empty string

	double totalScore; // instance variable initially 0.0
	int count; // instance variable initially 0
	
	public Student(String name) { // constructor
		this.name = name; 
	}	
	
	public String getName() {
		return this.name;
	}
	public void addQuiz(int score) {
		this.count += 1; // + 1 to the number of quizzes taken
	    this.totalScore = this.totalScore + score; 
	}
	
	// returns total score of students quizzes
	public double getTotalScore() {
	    return this.totalScore;
	  }
	
	// returns avg score of students quizzes
	  public double getAverageScore() {
	    return this.totalScore / this.count; 
	  }
	  
	public static void main(String[] args) {
		Student x = new Student("Laura");
	    System.out.println( "Student " + x + "'s name is: " +  x.getName() );
	    x.addQuiz(69); 
	    x.addQuiz(77);
	    x.addQuiz(21);
	    System.out.println( x.getName() + "'s total score is: " + x.getTotalScore() ); // expected 167.0
	    
	    Student y = new Student("Blake");
	    y.addQuiz(93);
	    System.out.println( y.getName() + "'s total score is: " + y.getTotalScore() );
	    System.out.println( x.getName() + "'s average score is: " + x.getAverageScore() ); // expected 55.6666...
	    System.out.println( y.getName() + "'s average score is: " + y.getAverageScore() );
	    
	  }

}
