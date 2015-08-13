import java.util.List;
import java.util.Random;


public class SimulationDriver {
	
	public static void main(String[] args) {
		//initialize the question
		System.out.print("Initializing Question: ");
		Question newQuestion = initializeQuestion();
		System.out.println("Done.");
		//pass the question to the iVoteService
		IVoteInterface iVoteService = new IVoteService();
		iVoteService.setQuestion(newQuestion);
		//generate student answers
		System.out.print("Generating Student Answers: ");
		List<Student> studentList = iVoteService.getStudentList();
		int numberOfPossibleAnswers = newQuestion.getNumberOfAnswers();
		int numberOfCorrectAnswers  = newQuestion.getNumberOfCorrectAnswers();
		for(int i = 0; i < studentList.size(); i++) {
			studentList.get(i).submitAnswer(numberOfPossibleAnswers, numberOfCorrectAnswers);
		}
		System.out.println("Done.");
 		//submit answers to iVoteService
		//output results
		System.out.print("Tallying Results: ");
		System.out.println("Done.\n");
		iVoteService.outputResults();
		//output every student answer
		for(int i = 0; i < studentList.size(); i++) {
			System.out.println();
			System.out.print(studentList.get(i).toString());
		}
		
	}
	
	//This method is used to initialize the question that will receive answers from students
	//In this version the answers and students are randomized.
	private static Question initializeQuestion() {
		Random random = new Random();
		Question newQuestion;
		String question = "Which statement has the same result as '2 + 2'?";
		//choose randomly between a single/multi answer question.
		//the first is a single answer question. the second is a multi answer question
		//the question is the same for both, but the answers vary slightly
		if(random.nextInt(2) == 0) {
			String[] possibleAnswers = {"A: 4 - 3", "B: 2 * 2", "C: 3 + 2", "D: 4 / 2", "E: 2 + 6 / 2"};
			Answer correctAnswer = new Answer();
			//sets the correct answer to 'B'
			correctAnswer.setAnswer(1);
			newQuestion = new SingleAnswerQuestion(question, possibleAnswers, correctAnswer);
		}
		else {
			String possibleAnswers[] = {"A: 4 - 3", "B: 2 * 2", "C: 3 + 2", "D: 4 / 1", "E: 2 + 6 / 2"};
			Answer correctAnswer = new Answer();
			//sets the correct answers to 'B' and 'D'
			correctAnswer.setAnswer(1);
			correctAnswer.setAnswer(3);
			newQuestion = new MultiAnswerQuestion(question, possibleAnswers, correctAnswer);
		}
		return newQuestion;
	}

}
