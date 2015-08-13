
public class MultiAnswerQuestion extends Question {
	
	public MultiAnswerQuestion(String question, String[] possibleAnswers, Answer correctAnswer) {
		super(question, possibleAnswers, correctAnswer);
	}
	
	public int getNumberOfCorrectAnswers() {
		int count = 0;
		for(int i = 0; i < 9; i++) {
			if(correctAnswer.getAnswer(i)) {
				count++;
			}
		}
		return count;
	}

}
