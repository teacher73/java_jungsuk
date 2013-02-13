/**
 *
 * @package		: object_oriented_analysis_design.chapter01
 * @FileName	: Type.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package object_oriented_analysis_design.chapter01;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 3. 오후 4:34:56
 * @version	1.0.0
 */

public enum Type {
	ACOUSTIC("acoustic"), ELECTRIC("electric");

	String value;

	private Type(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
}
