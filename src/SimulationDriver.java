import java.util.List;
import java.util.Random;


public class SimulationDriver {
	
	public static void main(String[] args) {
		//initialize the question
		System.out.print("Initializing Question: ");
		Question newQuestion = initializeQuestion();
		System.out.println("Done.");
		//pass the question to the iVoteService
		IVoteService iVoteService = new IVoteService();
		iVoteService.setQuestion(newQuestion);
		//generate student answers
		System.out.print("Generating Student Answers: ");
		List<Student> studentList = iVoteService.getStudentList();
		int numberOfPossibleAnswers = iVoteService.getQuestion().getNumberOfAnswers();
		int numberOfCorrectAnswers  =iVoteService.getQuestion().getNumberOfCorrectAnswers();
		for(int i = 0; i < studentList.size(); i++) {
			studentList.get(i).submitAnswer(numberOfPossibleAnswers, numberOfCorrectAnswers);
		}
		System.out.println("Done.");
 		//submit answers to iVoteService
		System.out.print("Tallying Results: ");
		iVoteService.applyStudentAnswers();
		System.out.println("Done.\n");
		//output results
		iVoteService.outputResults();
	}
	
	private static Question initializeQuestion() {
		Random random = new Random();
		Question newQuestion;
		String question = "Which statement has the same result as '2 + 2'?";
		if(random.nextInt(2) == 0) {
			String[] possibleAnswers = {"A: 4 - 3", "B: 2 * 2", "C: 3 + 2", "D: 4 / 2", "E: 2 + 6 / 2"};
			Answer correctAnswer = new Answer();
			correctAnswer.setAnswer(1);
			newQuestion = new SingleAnswerQuestion(question, possibleAnswers, correctAnswer);
		}
		else {
			String possibleAnswers[] = {"A: 4 - 3", "B: 2 * 2", "C: 3 + 2", "D: 4 / 1", "E: 2 + 6 / 2"};
			Answer correctAnswer = new Answer();
			correctAnswer.setAnswer(1);
			correctAnswer.setAnswer(3);
			newQuestion = new MultiAnswerQuestion(question, possibleAnswers, correctAnswer);
		}
		return newQuestion;
	}

}
