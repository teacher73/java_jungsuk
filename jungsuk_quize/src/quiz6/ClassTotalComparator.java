/**
 *
 * @package		: quiz6
 * @FileName	: ClassTotalComparator.java
 * @Date  		: 2012. 9. 23.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package quiz6;

import java.util.Comparator;

/**
 * 반별로 총점이 높은 순에서 낮은 순으로 정렬(반은 오름차순, 총점은 내림차순)
 * @author	MinSu Kim (net94@nate.com)
 * @since	2012. 9. 23. 오후 11:11:26
 * @version	1.0.0
 */
public class ClassTotalComparator implements Comparator<Student> {

	/**
	 *  반이 오름차순(std1-std2) 총점은 내림차순으로(std2-std1)
	 */
	@Override
	public int compare(Student std1, Student std2) {
		int result = std1.getClassNo() - std2.getClassNo(); 
        if(result==0) 
              result = std2.getTotal() - std1.getTotal(); 
        return result; 
	}

}
