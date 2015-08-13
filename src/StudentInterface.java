
public interface StudentInterface {
	
	//sets the student's answer given the number of possible answers and the number of correct answers
	public void submitAnswer(int numberOfPossibleAnswers, int numberOfCorrectAnswers);
	
	//returns a human readable string that represents the student's ID and their answer to the given question
	public String toString();
	
}
