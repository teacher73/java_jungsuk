/**
 *
 * @package		: quiz6
 * @FileName	: ClassStudentNoComparator.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package quiz6;

import java.util.Comparator;

/**
 * 반, 번호 순으로 내림차순 정렬
 * 
 * @author MinSu Kim (net94@nate.com)
 * @since 2012. 9. 23. 오후 11:13:12
 * @version 1.0.0
 */
public class ClassStudentNoComparator implements Comparator<Student> {

	/**
	 * 반, 번호 순으로 내림차순(std2-std1) 정렬
	 */
	@Override
	public int compare(Student std1, Student std2) {
		int result = std1.getClassNo() - std2.getClassNo();
		if (result == 0)
			result = std1.getStudentNo() - std2.getStudentNo();
		return result;
	}

}
