/**
 *
 * @package		: object_oriented_analysis_design.chapter01
 * @FileName	: Wood.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package object_oriented_analysis_design.chapter01;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 3. 오후 4:39:55
 * @version	1.0.0
 */

public enum Wood {
	INDIAN_ROSEWOOD("Indian Rosewood"), BRAZILIAN_ROSEWOOD("Brazilian Rosewood"),
	MAHOGANY("Mahoga"), COCOBOLO("Cocobolo"), CEDAR("Cedar"), ADIRONDACK("Adirondack"),
	ALDER("Alder"), SITKA("Sitka"), MAPLE("Maple");
	
	String value;

	private Wood(String value) {
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
}
