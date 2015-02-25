// main file

import java.io.*;
import java.util.*;

public class PartialParser
{

	static ArrayList<ArrayList<String>> contacts;
	
	public static void main(String[] args)
	{
		/* Import known names to contact list
		 * 1st item in inner ArrayList is name
		 * 2nd item is phone number
		 * 3rd item is email 
		 */
		contacts = new ArrayList<ArrayList<String>>();
		
		for(int i=0; i<5; i++)
			contacts.add(new ArrayList<String>());
		
		contacts.get(0).add("Mary"); contacts.get(0).add(""); contacts.get(0).add("");
		contacts.get(1).add("Matt"); contacts.get(1).add(""); contacts.get(1).add("");
		contacts.get(2).add("John"); contacts.get(2).add(""); contacts.get(2).add("");
		contacts.get(3).add("Bob"); contacts.get(3).add(""); contacts.get(3).add("");
		contacts.get(4).add("Lisa"); contacts.get(4).add(""); contacts.get(4).add("");
		
		

	}
	
	public String parser(String sentence)
	{
		String[] sentenceArray = sentence.split(" ");
		ArrayList<String> ontTypes;
		
		for(String word : sentenceArray)
		{
			/*
			 * do some stuff
			 */
		}
		
		return "ActionType";
	}
	
	

}
