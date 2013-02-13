/**
 *
 * @package		: object_oriented_analysis_design.chapter01
 * @FileName	: Builder.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package object_oriented_analysis_design.chapter01;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 3. 오후 4:37:48
 * @version	1.0.0
 */

public enum Builder {
	FENDER("Fender"), MARTIN("Martin"), GIBSON("Gibson"), COLLINGS("Collings"),
	OLSON("Olson"), RYAN("Ryan"), PRS("Prs"), ANY("Any");
	
	String value;

	private Builder(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
}
