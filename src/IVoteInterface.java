import java.util.List;


public interface IVoteInterface {
	
	//returns the list of students that are using the IVoteService
	public List<Student> getStudentList();
	
	//counts the number of votes each answer received from the question and outputs the number 
	//that each answer received.
	public String outputResults();
	
	//set the question that student will be answering
	public void setQuestion(QuestionInterface newQuestion);
}
