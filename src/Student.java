import java.util.Random;


public class Student implements StudentInterface {
	
	private int id;
	private Answer givenAnswer;
	
	public int getId() {
		return this.id;
	}
	
	public Answer generateAnswer(int questionType, int numberOfPossibleAnswers) {
		Answer answer = new Answer();
		if(numberOfPossibleAnswers > 9) {
			numberOfPossibleAnswers = 9;
		}
		Random random = new Random();
		random.nextInt(numberOfPossibleAnswers);
		if(questionType == Question.QUESTION_TYPE_SINGLE_CHOICE) {
			answer.setAnswer(random.nextInt(numberOfPossibleAnswers));
		}
		else if(questionType == Question.QUESTION_TYPE_MULTIPLE_CHOICE) {
			int numberOfAnswers = random.nextInt(numberOfPossibleAnswers);
			for(int i = 0; i < numberOfAnswers; i++) {
				answer.setAnswer(random.nextInt(numberOfPossibleAnswers));
			}
		}
		return answer;
	}
	
	public void submitAnswer(IVoteService iVoteService) {
		iVoteService.applyStudentAnswer(id, givenAnswer);
	}

}
