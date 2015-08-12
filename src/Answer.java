
public class Answer {
	
	private boolean A = false;
	private boolean B = false;
	private boolean C = false;
	private boolean D = false;
	private boolean E = false;
	private boolean F = false;
	private boolean G = false;
	private boolean H = false;
	private boolean I = false;
	
	public void setAnswer(int answerId) {
		switch(answerId) {
		case 0: A = true;
			return;
		case 1: B = true;
			return;
		case 2: C = true;
			return;
		case 3: D = true;
			return;
		case 4: E = true;
			return;
		case 5: F = true;
			return;
		case 6: G = true;
			return;
		case 7: H = true;
			return;
		case 8: I = true;
			return;
		}
	}
	
	public boolean equals(Answer possibleAnswer) {
		return (possibleAnswer.A == this.A) && (possibleAnswer.B == this.B) && (possibleAnswer.C == this.C) 
				&& (possibleAnswer.D == this.D) && (possibleAnswer.E == this.E) && (possibleAnswer.F == this.F) 
				&& (possibleAnswer.G == this.G) && (possibleAnswer.H == this.H) && (possibleAnswer.I == this.I); 
	}
	
	public void clearAnswers() {
		A = false;
		B = false;
		C = false;
		D = false;
		E = false;
		F = false;
		G = false;
		H = false;
		I = false;
	}
	
	public String toString() {
		String string = ""; 
		
		return string;
	}

}
