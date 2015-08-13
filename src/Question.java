
public abstract class Question implements QuestionInterface {
	
	private String question;
	private String[] possibleAnswers;
	Answer correctAnswer;

	public Question() {}
	
	public Question(String question, String[] possibleAnswers, Answer correctAnswer) {
		this.question = question;
		this. possibleAnswers = possibleAnswers;
		this.correctAnswer = correctAnswer;
	}
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(String[] possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	public Answer getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Answer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public abstract int getNumberOfCorrectAnswers();
	
	public int getNumberOfAnswers() {
		return possibleAnswers.length;
	}
	
	public String toString() {
		String string = question + "\n";
		for(int i = 0; i < possibleAnswers.length; i++) {
			string += possibleAnswers[i] + "\n";
		}
		string += "Correct answer(s): " + correctAnswer.toString() + "\n";
		return string;
		
	}
	

}
