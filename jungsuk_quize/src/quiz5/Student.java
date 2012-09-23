/*
 * quize4_1 / Student.java
 * 프로그램 설명	: 
 * 작성 일자 		: 2012. 7. 12.
 * 작성자 		: 
*/
package quiz5;

import java.util.Formatter;

public class Student implements Comparable<Student>{
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
		StringBuilder sb = new StringBuilder();
		Formatter f = new Formatter(sb);
		f.format("%5s\t%2d\t%2d\t%3d\t%3d\t%3d\t%3d", name,classNo,studentNo,koreanScore,mathScore,englishScore,total);
		return sb.toString();
	}

	@Override
	public int compareTo(Student obj) {
		return obj.total-this.total;
	}
	
}
