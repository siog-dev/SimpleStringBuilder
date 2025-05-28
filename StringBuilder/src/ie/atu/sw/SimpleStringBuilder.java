package ie.atu.sw;

public class SimpleStringBuilder {
	
	// Create a null constructor
	public SimpleStringBuilder() {
		
	}
	// Create a constructor that takes a string
	public SimpleStringBuilder(String s) {
		
	}
	
	public static void main(String[] args) {
		// Create an instance of the class using the null constructor
		SimpleStringBuilder ssb = new SimpleStringBuilder("THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG");
		
		//Print out the string builder
		System.out.println(ssb.toString()); // Convert to string representation
		System.out.println(ssb.reverse());
	}
	
}
