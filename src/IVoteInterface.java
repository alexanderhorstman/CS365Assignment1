
public interface IVoteInterface {
	
	public String outputResults();
	
	//add one to the answer that is given if the student has not already given an answer
	//
	//if an answer has already been given from the student, the previous answer should be
	//decremented, the answer should be changed, and the new answer should be incremented
	public void applyStudentAnswer(int studentId, Answer answer);
	
	public void setQuestion(Question newQuestion);
	
	

}
