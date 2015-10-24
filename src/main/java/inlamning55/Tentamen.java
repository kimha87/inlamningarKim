package inlamning55;

public class Tentamen {

  private int gLimit;
  private int vgLimit;
  String[] students;
  int[] testScore;
  private int counter = 1;

  public Tentamen(int gLimit, int vgLimit, int numberOfStudents) {
    students = new String[numberOfStudents];
    testScore = new int[numberOfStudents];
    this.gLimit = gLimit;
    this.vgLimit = vgLimit;
  }

  public String getGrade(int grade) {
		String s ="";
		if (grade >= vgLimit) {
			s = "VG";
		} else if (grade >= gLimit) {
			s = "G";
		} else {
			s = "IG";
		}
		return s;
	}

  public void setStudentName(String currentStudent){
    
  }

}}
