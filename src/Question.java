
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
	
	//returns the answer to this question
	public Answer getCorrectAnswer() {
		return correctAnswer;
	}
	
	
	//returns the number of possible answers to this question
	public int getNumberOfAnswers() {
		return possibleAnswers.length;
	}
	
	//must be defined in child classes
	//returns the number of correct answers to this question
	public abstract int getNumberOfCorrectAnswers();
	
	public String[] getPossibleAnswers() {
		return possibleAnswers;
	}
	
	//returns the question as a string
	public String getQuestion() {
		return question;
	}
	
	public void setPossibleAnswers(String[] possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}	
	
	public void setCorrectAnswer(Answer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	//returns a human readable string that represents the question, the possible choices for the question
	//and the correct answer(s)
	public String toString() {
		String string = question + "\n";
		for(int i = 0; i < possibleAnswers.length; i++) {
			string += possibleAnswers[i] + "\n";
		}
		string += "Correct answer(s): " + correctAnswer.toString() + "\n";
		return string;
	}
}
