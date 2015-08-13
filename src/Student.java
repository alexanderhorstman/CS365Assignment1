import java.util.Random;


public class Student implements StudentInterface {
	
	private int id;
	private Answer givenAnswer;
	
	public Student(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Answer getGivenAnswer() {
		return givenAnswer;
	}
	
	private Answer generateAnswer(int numberOfPossibleAnswers, int numberOfCorrectAnswers) {
		Answer answer = new Answer();
		if(numberOfPossibleAnswers > 9) {
			numberOfPossibleAnswers = 9;
		}
		Random random = new Random();
		if(numberOfCorrectAnswers == 1) {
			answer.setAnswer(random.nextInt(numberOfPossibleAnswers));
		}
		else if(numberOfCorrectAnswers > 1) {
			//int numberOfAnswers = random.nextInt(numberOfPossibleAnswers) + 1; // not used for now. in this version, only allowing students
																				 // to vote for two correct answers when there is more than 
																				 // one correct answer. (makes it easier to test)
			for(int i = 0; i < 2; i++) { 
				int answerId = random.nextInt(numberOfPossibleAnswers);
				while(answer.getAnswer(answerId)) {
					answerId = random.nextInt(numberOfPossibleAnswers);
				}
				answer.setAnswer(answerId);
			}
		}
		return answer;
	}
	
	public void submitAnswer(int numberOfPossibleAnswers, int numberOfCorrectAnswers) {
		givenAnswer = generateAnswer(numberOfPossibleAnswers, numberOfCorrectAnswers);
	}

}
