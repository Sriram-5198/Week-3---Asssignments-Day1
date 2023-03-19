package assignment5_string;

//import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
        String[] word = text.split(" ");
        int len = word.length;
        int count=0;

        for (int i = 0; i < len; i++) {
			for (int j = i+1; j <len; j++) {
                if (word[i].equals(word[j])) {
                	count++;
					
                }
               if (count>1) {
            	   //System.out.print();
               }
				
			}
	}

}
}