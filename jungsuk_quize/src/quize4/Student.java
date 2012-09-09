/*
 * quize4_1 / Student.java
 * 프로그램 설명	: 
 * 작성 일자 		: 2012. 7. 12.
 * 작성자 		: 
*/
package quize4;

public class Student {
	private String name;
	private int classNo;
	private int studentNo;
	private int koreanScore;
	private int mathScore;
	private int englishScore;
	private int total;
	
	public Student(String name, int classNo, int studentNo, int koreanScore,
			int mathScore, int englishScore) {
		this.name = name;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		total = koreanScore + mathScore + englishScore;
	}

	@Override
	public String toString() {
            return name + "\t" 
                  + classNo + "\t" 
                  + studentNo + "\t" 
                  + koreanScore + "\t" 
                  + mathScore + "\t" 
                  + englishScore + "\t" 
                  + total + "\t"; 
	}
	
}
