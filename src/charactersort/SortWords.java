package charactersort;

import java.util.Arrays;

public class SortWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input a string to sort
		String exmpl=new String("my name is harshada");  
		System.out.println("Characters of the string sorted :");
		//first break down the string on base of spaces
		String[] parts = exmpl.split("\\s+");   
		//add the string to array and then sort it using array sort function
		Arrays.sort(parts);  
		StringBuilder sb = new StringBuilder(); 
		//loop through the string and build the sorted string again
		for(String s:parts){  
		   sb.append(s);  
		   //takes each element of and array and appends it to previous value
		   sb.append(" ");  
		   
		   //breaking down each word in this loop itself to a character array
		   char[] charArray = s.toCharArray();
		   //sort the character array Alphabetically
		   Arrays.sort(charArray);
		   String sortedString = new String(charArray);
		   System.out.println(sortedString);  
		}  
		
		//output the sorted string
		String sorted = sb.toString().trim();  
		System.out.println("Sorted : "+sorted);
	}

}
