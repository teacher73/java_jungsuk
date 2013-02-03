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
	    
	    Guitar whatErinLikes = new Guitar("",  "fender", "Stratocastor", 
	                                      "electric", "Alder", "Alder", 0);
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
	    inventory.addGuitar("11277", "Collings", "CJ", "acoustic",
	                        "Indian Rosewood", "Sitka", 3999.95);
	    inventory.addGuitar("V95693", "Fender", "Stratocastor", "electric",
	                        "Alder", "Alder", 1499.95);
	    inventory.addGuitar("V9512", "Fender", "Stratocastor", "electric",
	                        "Alder", "Alder", 1549.95);
	    inventory.addGuitar("122784", "Martin", "D-18", "acoustic",
	                        "Mahogany", "Adirondack", 5495.95);
	    inventory.addGuitar("76531", "Martin", "OM-28", "acoustic",
	                        "Brazilian Rosewood", "Adriondack", 6295.95);
	    inventory.addGuitar("70108276", "Gibson", "Les Paul", "electric",
	                        "Mahogany", "Maple", 2295.95);
	    inventory.addGuitar("82765501", "Gibson", "SG '61 Reissue",
	                        "electric", "Mahogany", "Mahogany", 1890.95);
	    inventory.addGuitar("77023", "Martin", "D-28", "acoustic",
	                        "Brazilian Rosewood", "Adirondack", 6275.95);
	    inventory.addGuitar("1092", "Olson", "SJ", "acoustic",
	                        "Indian Rosewood", "Cedar", 12995.95);
	    inventory.addGuitar("566-62", "Ryan", "Cathedral", "acoustic",
	                        "Cocobolo", "Cedar", 8999.95);
	    inventory.addGuitar("6 29584", "PRS", "Dave Navarro Signature",
	                        "electric", "Mahogany", "Maple", 2100.95);
	  }
	}

