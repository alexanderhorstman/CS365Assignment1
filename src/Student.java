import java.util.Random;

public class Student implements StudentInterface {
	
	private int id; //unique student id
	private Answer givenAnswer; //answer that the student has chosen
	
	public Student(int id) {
		this.id = id;
	}
	
	//randomly generates an answer based on the number of possible answers and the number of correct answers
	private Answer generateAnswer(int numberOfPossibleAnswers, int numberOfCorrectAnswers) {
		Answer answer = new Answer();
		//check to make sure that an impossible value cannot be passed
		if(numberOfPossibleAnswers > 9) {
			numberOfPossibleAnswers = 9;
		}
		//check to make sure that an impossible value cannot be passed
		if(numberOfCorrectAnswers > 9) {
			numberOfCorrectAnswers = 9;
		}
		Random random = new Random();
		//if the question can only have one correct answer the student will only choose one answer at random
		if(numberOfCorrectAnswers == 1) {
			answer.setAnswer(random.nextInt(numberOfPossibleAnswers));
		}
		else if(numberOfCorrectAnswers > 1) {
			//randomly chooses how many answers to give for the question
			int numberOfAnswers = random.nextInt(numberOfPossibleAnswers) + 1;
			//chooses at random which answers to choose
			for(int i = 0; i < numberOfAnswers; i++) { 
				int answerId = random.nextInt(numberOfPossibleAnswers);
				//if the answer has already been given by the student, the student will choose 
				//another random answer until it has not already been chosen
				while(answer.getAnswer(answerId)) {
					answerId = random.nextInt(numberOfPossibleAnswers);
				}
				answer.setAnswer(answerId);
			}
		}
		return answer;
	}
	
	public Answer getGivenAnswer() {
		return givenAnswer;
	}
	
	public int getId() {
		return this.id;
	}
	
	//sets the student's answer given the number of possible answers and the number of correct answers
	//in this version the student's answers are being chosen at random
	public void submitAnswer(int numberOfPossibleAnswers, int numberOfCorrectAnswers) {
		givenAnswer = generateAnswer(numberOfPossibleAnswers, numberOfCorrectAnswers);
	}
	
	//returns a human readable string that represents the student's ID and their answer to the given question
	public String toString() {
		return "ID: " + id + "\nStudent Answer: " + givenAnswer.toString() + "\n";
	}

}
