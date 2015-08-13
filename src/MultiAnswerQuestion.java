
public class MultiAnswerQuestion extends Question {
	
	//constructor calls the parent constructor
	public MultiAnswerQuestion(String question, String[] possibleAnswers, Answer correctAnswer) {
		super(question, possibleAnswers, correctAnswer);
	}
	
	//checks each possible answer to check how many correct answers there are and returns that value
	public int getNumberOfCorrectAnswers() {
		int count = 0;
		//the max number of possible answers is '9'
		for(int i = 0; i < 9; i++) {
			//correctAnswer is a member of the parent class
			if(correctAnswer.getAnswer(i)) {
				count++;
			}
		}
		return count;
	}

}
