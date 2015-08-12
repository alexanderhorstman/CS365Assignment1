import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class IVoteService implements IVoteInterface {
	
	private int AVotes;
	private int BVotes;
	private int CVotes;
	private int DVotes;
	private int EVotes;
	private int FVotes;
	private int GVotes;
	private int HVotes;
	private int IVotes;
	private Question currentQuestion;
	private Map<Integer, Student> studentList = new HashMap<Integer, Student>();
	
	public IVoteService() {
		Random random = new Random();
		int numberOfStudents = random.nextInt(45) + 1;
		//create between 1 and 45 new students
		for(int i = 0; i < numberOfStudents; i++) {
			//create a new student in the hash map with an id between 100000 and 999999
			studentList.put(random.nextInt(900000) + 100000, new Student());
		}
	}
	
	public String outputResults() {
		String result = ""; 
		result += "A: " + AVotes + "\nB: " + BVotes + "\nC: " + CVotes + "D: " + DVotes + "\nE: " 
		+ EVotes + "\nF: " + FVotes + "G: " + GVotes + "\nH: " + HVotes + "\nI: " + IVotes;
		System.out.println(currentQuestion.toString() + "\n" + result);
		return result;
	}
	
	//add one to the answer that is given if the student has not already given an answer
	//
	//if an answer has already been given from the student, the previous answer should be
	//decremented, the answer should be changed, and the new answer should be incremented
	public void applyStudentAnswer(int studentId, Answer answer) {
		
	}
	
	public void setQuestion(Question newQuestion) {
		this.currentQuestion = newQuestion;
	}

}
