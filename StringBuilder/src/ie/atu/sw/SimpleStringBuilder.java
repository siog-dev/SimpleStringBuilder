package ie.atu.sw;

public class SimpleStringBuilder {
	// Add default values for clarity (optional)
	private char[] text = null; // Char = 2 byte/16 bits - use to represent unicode
	private int index = 0; // Figure out where we are in the index for operations
	
	// Create a null constructor
	public SimpleStringBuilder() {
	// Need to give it an initial capacity - how long is a piece of string?
		text = new char[4]; // 4 is a nice power of two - it'll do!
		
	}
	// Create a constructor that takes a string
	public SimpleStringBuilder(String s) {
		// Initialise the constructor public SimpleStringBuilder()
		this(); // Call the constructor that takes no parameters
		append(s);
	}
	// Add methods so that the program will compile
	public void append(String s) {
		// Loop over each char in String s and pass each char to append(char c)
		for (int i = 0; i < s.length(); i++) {
			append(s.charAt(i));
		}
	}
	// Overload the method - same name, different parameters
	public void append(char c) {
		// Can append a char
		text[index] = c; // text[ith position] = c
		index++; // Increment by index++
	}
	
	// Loop backwards over the string
	public String reverse() {
		// Reverse the array, pass to string constructor because we're returning a string
		char[] temp = new char[text.length]; // Char array should be the same length as text
		
		// Loop for reversing the array
		int currentIndex = 0;
		// Start at zero
		for (int i = index - 1; i >= 0; i--) {
			temp[]
			currentIndex++;
		}
		
		// Return a string and pass it the char array
		return new String(temp);
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