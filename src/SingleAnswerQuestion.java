
public class SingleAnswerQuestion extends Question {
	
	//constructor calls the parent constructor
	public SingleAnswerQuestion(String question, String[] possibleAnswers, Answer correctAnswer) {
		super(question, possibleAnswers, correctAnswer);
	}
	
	//returns '1' because there can only be one correct answer for this type of question
	public int getNumberOfCorrectAnswers() {
		return 1;
	}

}
