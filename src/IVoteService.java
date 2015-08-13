import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IVoteService implements IVoteInterface {
	
	private int AVotes; //number of votes answer A received
	private int BVotes; //number of votes answer B received
	private int CVotes; //number of votes answer C received
	private int DVotes; //number of votes answer D received
	private int EVotes; //number of votes answer E received
	private int FVotes; //number of votes answer F received
	private int GVotes; //number of votes answer G received
	private int HVotes; //number of votes answer H received
	private int IVotes; //number of votes answer I received
	private QuestionInterface currentQuestion; //the question students are currently answering
	private List<Student> studentList = new ArrayList<Student>(); //the list of students that are using the IVoteService
	
	public IVoteService() {
		Random random = new Random();
		int numberOfStudents = random.nextInt(20) + 25;
		//create between 1 and 45 new students
		for(int i = 0; i < numberOfStudents; i++) {
			//create a new student in the list with an id between 100000 and 999999
			studentList.add(new Student(random.nextInt(900000) + 100000));
		}
	}
	
	//adds one to the count from the given answerId
	//answers are ordered from A to I (0 to 8)
	private void addOneToAnswerTotal(int answerId) {
		if(answerId == 0) {
			AVotes++;
		}
		else if(answerId == 1) {
			BVotes++;
		}
		else if(answerId == 2) {
			CVotes++;	
		}
		else if(answerId == 3) {
			DVotes++;
		}
		else if(answerId == 4) {
			EVotes++;
		}
		else if(answerId == 5) {
			FVotes++;
		}
		else if(answerId == 6) {
			GVotes++;
		}
		else if(answerId == 7) {
			HVotes++;
		}
		else if(answerId == 8) {
			IVotes++;
		}
	}
	
	//adds one to the count for each answer from the student's answers
	private void applyStudentAnswers() {
		for(Student s: studentList) {
			Answer studentAnswer = s.getGivenAnswer();
			//step through all of the possible answers the student could have given 
			for(int i = 0; i < currentQuestion.getNumberOfAnswers(); i++) {
				if(studentAnswer.getAnswer(i)) {
					addOneToAnswerTotal(i);
				}
			}
		}
	}
	
	//returns the question that is currently being answered
	public QuestionInterface getQuestion() {
		return currentQuestion;
	}
	
	//returns the list of students that are using the IVoteService
	public List<Student> getStudentList() {
		return studentList;
	}
	
	//counts the number of votes each answer received from the question and outputs the number 
	//that each answer received.
	public String outputResults() {
		applyStudentAnswers();
		System.out.println("Number of students: " + studentList.size());
		String result = ""; 
		result += "A: " + AVotes + "\nB: " + BVotes + "\nC: " + CVotes + "\nD: " + DVotes + "\nE: " 
		+ EVotes + "\nF: " + FVotes + "\nG: " + GVotes + "\nH: " + HVotes + "\nI: " + IVotes;
		System.out.println(currentQuestion.toString() + "\n" + result);
		return result;
	}
	
	//sets the new question to be answered
	public void setQuestion(QuestionInterface newQuestion) {
		this.currentQuestion = newQuestion;
	}

}
