
package javaapplication19;

public class Item {
    private String itemName;
    private double price;
public Item(String itemName, double price) {
	this.itemName = itemName;
	this.price = price;
}
   public void display() {
	   System.out.println("Item Name: "+itemName);
	   System.out.println("Item Price: "+price);
   }
  
}
