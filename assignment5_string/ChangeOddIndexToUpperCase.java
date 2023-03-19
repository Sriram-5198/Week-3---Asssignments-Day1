package assignment5_string;

//import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] te = test.toCharArray();
		for (int i = 0; i < te.length; i++) {
			if (i%2!=0) {
				te[i]=Character.toUpperCase(te[i]);
			}
			System.out.print(te[i]);
		}

	}

}
