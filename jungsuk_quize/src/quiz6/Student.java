/*
 * quize4_1 / Student.java
 * 프로그램 설명	: 
 * 작성 일자 		: 2012. 7. 12.
 * 작성자 		: 
*/
package quiz6;

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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the classNo
	 */
	public int getClassNo() {
		return classNo;
	}

	/**
	 * @param classNo the classNo to set
	 */
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}

	/**
	 * @return the studentNo
	 */
	public int getStudentNo() {
		return studentNo;
	}

	/**
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	/**
	 * @return the koreanScore
	 */
	public int getKoreanScore() {
		return koreanScore;
	}

	/**
	 * @param koreanScore the koreanScore to set
	 */
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	/**
	 * @return the mathScore
	 */
	public int getMathScore() {
		return mathScore;
	}

	/**
	 * @param mathScore the mathScore to set
	 */
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	/**
	 * @return the englishScore
	 */
	public int getEnglishScore() {
		return englishScore;
	}

	/**
	 * @param englishScore the englishScore to set
	 */
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	
}
