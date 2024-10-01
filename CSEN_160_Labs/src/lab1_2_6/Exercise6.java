package lab1_2_6;
import java.io.*;
import java.util.Scanner;

public class Exercise6 {
	public static String fullName(String firstName, String middleName, String lastName){
		//Change all names to correct formatting. 
		//uppercase first letter, lowercase following letters, first letter of middle name
		String NewFirstName = firstName.substring(0,1).toUpperCase() +firstName.substring(1).toLowerCase();
		String NewMiddleName = middleName.substring(0,1).toUpperCase() + ".";
		String NewLastName = lastName.substring(0,1).toUpperCase() +lastName.substring(1).toLowerCase();
		String Name = NewLastName + " " + NewFirstName +" "+ NewMiddleName;
		System.out.println(Name);
		return Name;
	}
	
	public static boolean palindrome(String text){
		//remove all commas/spaces, and convert all uppercase to lowercase
		String cleanedText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		StringBuffer tempStr = new StringBuffer(cleanedText); 				//create string buffer
		tempStr = tempStr.reverse(); 										//reverse string buffer
		String strReversed = tempStr.toString(); 							//convert string buffer to string

		//check if reversed string and original string match
		if (strReversed.equals(cleanedText)) {
			System.out.println(text +" IS A PALINDROME!");
			return true;
		}else {
			System.out.println(text +" is NOT a palindrome.");
			return false;
		}
	}
	public static void main (String [] args){
		//test given name and my own name
		fullName("robert","james","CLARK");
		fullName("RONALD", "bilius", "wEasleY");
		//test all given words for palindrome
		palindrome("A man, a plan, a canal, Panama");
		palindrome("desserts");
		palindrome("radar");
		palindrome("Madam");
	}
}
