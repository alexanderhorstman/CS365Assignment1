
public class Question implements QuestionInterface {
	
	public static final int QUESTION_TYPE_MULTIPLE_CHOICE = 1;
	public static final int QUESTION_TYPE_SINGLE_CHOICE = 2;
	
	private String question;
	private Answer[] possibleAnswers;
	private Answer correctAnswer;
	private int questionType;
	
	public int getQuestionType() {
		return questionType;
	}
	
	public int getNumberOfAnswers() {
		return possibleAnswers.length;
	}
	
	public String toString() {
		String string = question + "\n";
		for(int i = 0; i < possibleAnswers.length; i++) {
			string += possibleAnswers[i].toString() + "\n";
		}
		string += correctAnswer;
		return string;
		
	}
	

}
