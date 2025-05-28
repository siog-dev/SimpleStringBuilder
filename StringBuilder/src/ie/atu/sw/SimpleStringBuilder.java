package ie.atu.sw;

public class SimpleStringBuilder {
	private char[] text; // Char = 2 byte/16 bits - use to represent unicode
	private int index; // Figure out where we are in the index for operations
	
	// Create a null constructor
	public SimpleStringBuilder() {
	// Need to give it an initial capacity - how long is a piece of string?
		text = new char[4]; // 4 is a nice power of two - it'll do!
		
	}
	// Create a constructor that takes a string
	public SimpleStringBuilder(String s) {
		// Initialise the constructor public SimpleStringBuilder()
		this(); // Call the constructor that takes no parameters
	}
	// Add methods so that the program will compile
	public void append(String s) {
		
	}
	// Overload the method - same name, different parameters
	public void append(char s) {
		
	}
	
	public String reverse() {
		return null;
	}
	
	public static void main(String[] args) {
		// Create an instance of the class using the null constructor
		SimpleStringBuilder ssb = new SimpleStringBuilder("THEQUICKBROWNFOXJUMPS");
		ssb.append("OVERTHELAZYDOG"); // Append end of sentence efficiently
		//Print out the string builder
		System.out.println(ssb.toString()); // Convert to string representation
		System.out.println(ssb.reverse());
	}
	
}