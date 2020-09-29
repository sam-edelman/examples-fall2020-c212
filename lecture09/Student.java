
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
	
	public static void main(String[] args) {
		Student x = new Student("Laura");
	    System.out.println( "Student " + x + "'s name is: " +  x.getName() );
	    x.addQuiz(89); 
	    x.addQuiz(97);
	    x.addQuiz(91);
	    
	    Student y = new Student("Blake");
	    y.addQuiz(93);
	    
	  }

}
