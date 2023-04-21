package Activity;

class SubMarks {
	// These variables are instance variables, defined in class.
	int ScienceMarks;
	int MathsMarks;
	int GKMarks;
	}
public class SubjectMarks {
	public static void main(String[] args) {
	// Student 1
	SubMarks Subj1 = new SubMarks();
	Subj1.ScienceMarks = 60;
	Subj1.MathsMarks = 80;
	Subj1.GKMarks = 70;
	// Student 2
	SubMarks Subj2 = new SubMarks();
	Subj2.ScienceMarks = 85;
	Subj2.MathsMarks = 50;
	Subj2.GKMarks = 95;
	// displaying marks for Student 1
	System.out.println("Marks for first object:");
	System.out.println(Subj1.ScienceMarks);
	System.out.println(Subj1.MathsMarks);
	System.out.println(Subj1.GKMarks);
	// displaying marks for Student 2
	System.out.println("Marks for second object:");
	System.out.println(Subj2.ScienceMarks);
	System.out.println(Subj2.MathsMarks);
	System.out.println(Subj2.GKMarks);
	}
}
