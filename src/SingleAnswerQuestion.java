
public class SingleAnswerQuestion extends Question {
	
	public SingleAnswerQuestion(String question, String[] possibleAnswers, Answer correctAnswer) {
		super(question, possibleAnswers, correctAnswer);
	}
	
	public int getNumberOfCorrectAnswers() {
		return 1;
	}

}
