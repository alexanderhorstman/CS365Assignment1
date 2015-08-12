
public interface QuestionInterface {
	
	public static final int QUESTION_TYPE_MULTIPLE_CHOICE = 1;
	public static final int QUESTION_TYPE_SINGLE_CHOICE = 2;
	
	public int getQuestionType();
	
	public int getNumberOfAnswers();
	
	public String toString();

}
