
package javaapplication19;

public class User {
    protected String id;
    protected String passwd;

	public User(String id, String passwd) {
		this.id = id;
		this.passwd = passwd;
	}
	

	public void display() {
		System.out.println("User Id : "+id);
	
	}
}
