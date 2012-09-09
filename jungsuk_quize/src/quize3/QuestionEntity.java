/*
 * QuizEx1 / Question.java
 * ���α׷� ����	: ������ �����ϴ� EntityClass
 * �ۼ� ���� 		: 2012. 7. 5.
 * �ۼ��� 		: 
*/
package quize3;

public class QuestionEntity {
	private String exam;		//����
	private int solution;		//����
	private String[] selection;	//���
	private int userSolution;	//����ڴ�
	
	public QuestionEntity() { }

	public QuestionEntity(String exam, int solution, String[] selection) {
		this.exam = exam;
		this.solution = solution;
		this.selection = selection;
	}

	public String getExam() {
		return exam;
	}

	public void setExam(String exam) {
		this.exam = exam;
	}

	public int getSolution() {
		return solution;
	}

	public void setSolution(int solution) {
		this.solution = solution;
	}

	public String[] getSelection() {
		return selection;
	}

	public void setSelection(String[] selection) {
		this.selection = selection;
	}
	
	public int getUserSolution() {
		return userSolution;
	}

	public void setUserSolution(int userSolution) {
		this.userSolution = userSolution;
	}
}
