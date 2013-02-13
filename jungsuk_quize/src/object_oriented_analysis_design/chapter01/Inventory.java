/**
 *
 * @package		: object_oriented_analysis_design.chapter01
 * @FileName	: Inventory.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package object_oriented_analysis_design.chapter01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 3. 오후 3:56:50
 * @version	1.0.0
 */

public class Inventory {
	private ArrayList<Guitar> guitars;

	public Inventory() {
		guitars = new ArrayList<>();
	}
	
	public void addGuitar(String serialNumber,Builder builder,String model,Type type,Wood backWood,Wood topWood,double price){
		Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber){
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();){
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) return guitar;
		}
		return null;
	}
	
	public Guitar search(Guitar searchGuitar){
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ){
			Guitar guitar = i.next();
			String builder = searchGuitar.getBuilder().getValue().toLowerCase();
			if ( (builder != null) && (!builder.equals("") && (!builder.equals(guitar.getBuilder())))) continue;
			
			String model = searchGuitar.getModel();
			if ( (model != null) && (!model.equals("") && (!model.equals(guitar.getModel()))) ) continue;
			
			String type = searchGuitar.getType().getValue().toLowerCase();
			if ( (type != null) && (!type.equals("") && (!type.equals(guitar.getType()))) ) continue;
			
			String backWood = searchGuitar.getBackWood().getValue().toLowerCase();
			if ( (backWood != null) && (!backWood.equals("") && (!backWood.equals(guitar.getBackWood()))) ) continue;
			
			String topWood = searchGuitar.getTopWood().getValue().toLowerCase();
			if ( (topWood != null) && (!topWood.equals("") && (!topWood.equals(guitar.getTopWood()))) ) continue;
			
			return guitar;
		}
		return null;
	}
}
