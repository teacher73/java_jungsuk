
package quize1_02;


public class QuestionEntity {
	private String exam;
	private String[] selection;
	private int solution;
	
	public QuestionEntity(String examString) {
		String[] data = examString.split("`", 3);
		this.exam = data[0];
		this.solution = Integer.parseInt(data[1]);
		this.selection = data[2].split("`");
	}

	public String[] getSelection() {
		return selection;
	}

	public String getExam() {
		return exam;
	}

	public int getSolution() {
		return solution;
	}
	
}
