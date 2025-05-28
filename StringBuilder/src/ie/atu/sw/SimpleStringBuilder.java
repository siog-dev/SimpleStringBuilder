package ie.atu.sw;

import java.util.Arrays;

public class SimpleStringBuilder {
	private char[] text = null;
	private int index = 0;
	
	public SimpleStringBuilder() {
		text = new char[4];
	}
	
	public SimpleStringBuilder(String s) {
		this();
		append(s);
	}
	
	public void append(String s) {
		for (int i = 0; i < s.length(); i++) {
			append(s.charAt(i));
		}
	}

	public void append(char c) {
		ensureCapacity();
		text[index] = c;
		index++;
	}
	
	private void ensureCapacity() {
		if (index >= text.length) {
			char[] temp = new char[text.length + 1];

			for (int i = 0; i < text.length; i++) {
				temp[i] = text[i];
			}

			text = temp;
		}
	}
	
	public String reverse() {
		char[] temp = new char[index];
		
		int currentIndex = 0;
		for (int i = index - 1; i >= 0; i--) {
			temp[currentIndex] = text[i];
			currentIndex++;
		}

		return new String(temp);
	}
	
	public String toString() {
		return new String(text);
	}

	public static void main(String[] args) {
		SimpleStringBuilder ssb = new SimpleStringBuilder("THEQUICKBROWNFOXJUMPS");
		ssb.append("OVERTHELAZYDOG");
		System.out.println(ssb.toString());
		System.out.println(ssb.reverse());
	}
}