package ClassBin;
import java.util.Scanner;


public class Uerstring {
	  public static void main(String args[]) {
	    Scanner text = new Scanner(System.in);
	    System.out.print("\nEnter a string: ");
	    String in = text.nextLine();
	    int i, ascii;
	    char ori, newChar = 0;
	    String uppercaseString = "";
	    String lowercaseString = "";
	    String titlecaseString = "";

	    for (i = 0; i < in.length(); i++) {
	      ori = in.charAt(i);
	      ascii = (int) ori;
	      if (ascii >= 97 && ascii <= 122) {
	        ascii -= 32;
	        newChar = (char) ascii;
	      } else {
	        newChar = ori;
	      }
	      uppercaseString += newChar;
	    }
	    System.out.println("\nUppercase String: " + uppercaseString);
	    for (i = 0; i < in.length(); i++) {
	      ori = in.charAt(i);
	      ascii = (int) ori;
	      if (ascii >= 65 && ascii <= 90) {
	        ascii += 32;
	        newChar = (char) ascii;
	      } else {
	        newChar = ori;
	      }
	      lowercaseString += newChar;
	    }
	    System.out.println("\nLowercase String: " + lowercaseString);
	    for (i = 0; i < in.length(); i++) {
		      ori = in.charAt(i);
		      ascii = (int) ori;
		      if(i==0 ||in.charAt(i-1)==' ') {
		    	  if (ascii >= 97 && ascii <= 122) {
		  	        ascii -= 32;
		  	        newChar = (char) ascii;
		  	      }else {
				        newChar = ori;
			      } 
		    	} else {
		        newChar = ori;
		      } 
		      titlecaseString += newChar;
		    }
		 System.out.println("\nTitlecase String: " + titlecaseString);
	  }
	}


