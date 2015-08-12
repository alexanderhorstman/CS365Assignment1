
public interface StudentInterface {
	
	public int getId();
	
	public Answer generateAnswer(int questionType, int numberOfAnswers);
	
	public void submitAnswer(IVoteService iVoteService);
	
	

}
