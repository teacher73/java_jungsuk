/**
 *
 * @package		: object_oriented_analysis_design.chapter01
 * @FileName	: FindGuitarTester.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package object_oriented_analysis_design.chapter01;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 3. 오후 4:24:50
 * @version	1.0.0
 */

public class FindGuitarTester {

	  public static void main(String[] args) {
	    // Set up Rick's guitar inventory
	    Inventory inventory = new Inventory();
	    initializeInventory(inventory);
	    
	    Guitar whatErinLikes = new Guitar("",  Builder.FENDER, "Stratocastor", 
	                                      Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 0);
	    Guitar guitar = inventory.search(whatErinLikes);
	    if (guitar != null) {
	      System.out.println("Erin, you might like this " +
	        guitar.getBuilder() + " " + guitar.getModel() +  " " +
	        guitar.getType() + " guitar:\n   " +
	        guitar.getBackWood() + " back and sides,\n   " +
	        guitar.getTopWood() + " top.\nYou can have it for only $" +
	        guitar.getPrice() + "!");
	    } else {
	      System.out.println("Sorry, Erin, we have nothing for you.");
	    }
	  }

	  private static void initializeInventory(Inventory inventory) {
	    inventory.addGuitar("11277", 	Builder.COLLINGS, 	"CJ", 						Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, 	Wood.SITKA, 	3999.95);
	    inventory.addGuitar("V95693", 	Builder.FENDER, 	"Stratocastor",				Type.ELECTRIC, Wood.ALDER, 				Wood.ALDER, 	1499.95);
	    inventory.addGuitar("V9512", 	Builder.FENDER, 	"Stratocastor", 			Type.ELECTRIC, Wood.ALDER, 				Wood.ALDER, 	1549.95);
	    inventory.addGuitar("122784", 	Builder.MARTIN,		"D-18", 					Type.ACOUSTIC, Wood.MAHOGANY, 			Wood.ADIRONDACK,5495.95);
	    inventory.addGuitar("76531", 	Builder.MARTIN,		"OM-28",					Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK,6295.95);
	    inventory.addGuitar("70108276", Builder.GIBSON, 	"Les Paul", 				Type.ELECTRIC, Wood.MAHOGANY, 			Wood.MAPLE, 	2295.95);
	    inventory.addGuitar("82765501", Builder.GIBSON,		"SG '61 Reissue", 			Type.ELECTRIC, Wood.MAHOGANY,			Wood.MAHOGANY, 	1890.95);
	    inventory.addGuitar("77023", 	Builder.MARTIN, 	"D-28", 					Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK,6275.95);
	    inventory.addGuitar("1092", 	Builder.OLSON, 		"SJ", 						Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, 	Wood.CEDAR, 	12995.95);
	    inventory.addGuitar("566-62", 	Builder.RYAN, 		"Cathedral", 				Type.ACOUSTIC, Wood.COCOBOLO,			Wood.CEDAR, 	8999.95);
	    inventory.addGuitar("6 29584", 	Builder.PRS,		"Dave Navarro Signature",	Type.ELECTRIC, Wood.MAHOGANY, 			Wood.MAPLE, 	2100.95);
	  }
	}

