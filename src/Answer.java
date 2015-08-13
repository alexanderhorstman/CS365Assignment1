
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
	
	public boolean getAnswer(int answerId) {
		if(answerId == 0) {
			return A;
		}
		else if(answerId == 1) {
			return B;
		}
		else if(answerId == 2) {
			return C;
		}
		else if(answerId == 3) {
			return D;
		}
		else if(answerId == 4) {
			return E;
		}
		else if(answerId == 5) {
			return F;
		}
		else if(answerId == 6) {
			return G;
		}
		else if(answerId == 7) {
			return H;
		}
		else if(answerId == 8) {
			return I;
		}
		else {
			return false;
		}
	}
	
	public void setAnswer(int answerId) {
		if(answerId == 0) {
			A = true;
		}
		else if(answerId == 1) {
			B = true;
		}
		else if(answerId == 2) {
			C = true;
		}
		else if(answerId == 3) {
			D = true;
		}
		else if(answerId == 4) {
			E = true;
		}
		else if(answerId == 5) {
			F = true;
		}
		else if(answerId == 6) {
			G = true;
		}
		else if(answerId == 7) {
			H = true;
		}
		else if(answerId == 8) {
			I = true;
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
		if(A) {
			string += "A\t";
		}
		if(B) {
			string += "B\t";
		}
		if(C) {
			string += "C\t";
		}
		if(D) {
			string += "D\t";
		}
		if(E) {
			string += "E\t";
		}
		if(F) {
			string += "F\t";
		}
		if(G) {
			string += "G\t";
		}
		if(H) {
			string += "H\t";
		}
		if(I) {
			string += "I\t";
		}
		return string;
	}

}
