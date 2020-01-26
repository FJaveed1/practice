package seleniumconcepts;

import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Iterator {

	public static void main(String[] args) {
	
	        ArrayList<String> list = new ArrayList<String>(); 
	  
	        list.add("A"); 
	        list.add("B"); 
	        list.add("C"); 
	        list.add("D"); 
	        list.add("E"); 
	  
	        // Iterator to traverse the list 
	        Iterator iterator =  (Iterator) list.iterator(); 
	  
	        System.out.println("List elements : "); 
	  
	        while (iterator.hasNext()) 
	            System.out.print(iterator.next() + " "); 
	  
	        System.out.println();

	}

	private String next() {
		return null;
	}

	private boolean hasNext() {
		return false;
	}

}
