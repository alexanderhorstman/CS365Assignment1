
public interface QuestionInterface {
	
	//returns the number of possible answers a student could choose from
	public int getNumberOfAnswers();
	
	//returns the number of correct answers for the question
	public int getNumberOfCorrectAnswers();
	
	//returns a human readable string that represents the question, the possible choices for the question
	//and the correct answer(s)
	public String toString();

}
