
public class Answer {
	
	private boolean A = false; //true if A is a valid answer
	private boolean B = false; //true if B is a valid answer
	private boolean C = false; //true if C is a valid answer
	private boolean D = false; //true if D is a valid answer
	private boolean E = false; //true if E is a valid answer
	private boolean F = false; //true if F is a valid answer
	private boolean G = false; //true if G is a valid answer
	private boolean H = false; //true if H is a valid answer
	private boolean I = false; //true if I is a valid answer
	
	//default constructor does nothing
	public Answer() {}
	
	//sets all values to false
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
	
	//returns a boolean based on whether the answerId corresponds to a correct answer
	//answers are ordered from A to I (0 to 8)
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
	
	//sets the answer that corresponds to the answerId to true
	//answers are ordered from A to I (0 to 8)
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
	
	//returns a human readable representation of the correct answers
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
