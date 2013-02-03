/**
 *
 * @package		: object_oriented_analysis_design.chapter01
 * @FileName	: Guitar.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package object_oriented_analysis_design.chapter01;

/**
 * Page 40page
 * @author	mskim
 * @since	2013. 2. 3. 오후 3:54:32
 * @version	1.0.0
 */

public class Guitar {
	private String serialNumber;
	private String builder;
	private String model;
	private String type;
	private String backWood;
	private String topWood;
	private double price;
	
	public Guitar(String serialNumber, String builder, String model,
			String type, String backWood, String topWood, double price) {
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;
	}

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @return the builder
	 */
	public String getBuilder() {
		return builder;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the backWood
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * @return the topWood
	 */
	public String getTopWood() {
		return topWood;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
}
