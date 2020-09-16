package testrun;

import java.util.Arrays;

public class sortedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] exampleArray = {"COSC499", "Mads", "Football", "Rugby", "Cricket", "Soccer"};
	      int size = exampleArray.length;

	      for(int i = 0; i<size-1; i++) {
	         for (int j = i+1; j<exampleArray.length; j++) {
	            if(exampleArray[i].compareTo(exampleArray[j])>0) {
	               String temp = exampleArray[i];
	               exampleArray[i] = exampleArray[j];
	               exampleArray[j] = temp;
	            }
	         }
	      }
	      System.out.println(Arrays.toString(exampleArray));
	}

}
