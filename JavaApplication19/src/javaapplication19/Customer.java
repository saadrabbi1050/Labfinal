
package javaapplication19;


public class Customer extends User{
Item item;
private String name,email;
public Customer(String id, String pass, Item item, String name, String email) {
	super(id, pass);
	this.item = item;
	this.name = name;
	this.email = email;
}

 
@Override
public void display() {
	 super.display();
	 System.out.println("Name: "+name);
	 System.out.println("E-mail: "+email);
	 item.display();
 }

 public static void main(String[]args) {
	 Item item=new Item("chocolate",100.00);
	 Customer saad= new Customer("1050","Uc-a1233",item,"Saad","fazla15-1050@diu.edu.bd");
	 saad.display();
 }
}
