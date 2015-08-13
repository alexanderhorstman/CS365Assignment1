import java.util.ArrayList;
import java.util.List;
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
	private List<Student> studentList = new ArrayList<Student>();
	
	public IVoteService() {
		Random random = new Random();
		int numberOfStudents = random.nextInt(20) + 25;
		//create between 1 and 45 new students
		for(int i = 0; i < numberOfStudents; i++) {
			//create a new student in the list with an id between 100000 and 999999
			studentList.add(new Student(random.nextInt(900000) + 100000));
		}
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}
	
	public String outputResults() {
		System.out.println("Number of students: " + studentList.size());
		
		String result = ""; 
		result += "A: " + AVotes + "\nB: " + BVotes + "\nC: " + CVotes + "\nD: " + DVotes + "\nE: " 
		+ EVotes + "\nF: " + FVotes + "\nG: " + GVotes + "\nH: " + HVotes + "\nI: " + IVotes;
		System.out.println(currentQuestion.toString() + "\n" + result);
		return result;
	}
	
	public void applyStudentAnswers() {
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
	
	public Question getQuestion() {
		return currentQuestion;
	}
	
	public void setQuestion(Question newQuestion) {
		this.currentQuestion = newQuestion;
	}

}
