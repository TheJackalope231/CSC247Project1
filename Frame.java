// Class used for creating frames

import java.util.*;

//public class Frame
//{
	
//}

class Find
{
	String name;
	String number;
	String email;
	String target; //information desired
	ArrayList<ArrayList<String>> contacts;
	
	public Find(ArrayList<ArrayList<String>> contacts, String target, String name, String number, String email)
	{
		this.contacts = contacts;
		this.target = target;
		this.name = name;
		this.number = number;
		this.email = email;
	}
	
	public String findTarget()
	{
		String output;
		ArrayList<String> thisContact = new ArrayList<String>();
		
		if (!name.equals(""))
		{
			for(ArrayList<String> c : contacts)
			{
				if(c.get(0).equals(name))
					thisContact = c;
			}
		}
		else if (!number.equals(""))
		{
			for(ArrayList<String> c : contacts)
			{
				if(c.get(1).equals(number))
					thisContact = c;
			}
		}
		else if (!email.equals(""))
		{
			for(ArrayList<String> c : contacts)
			{
				if(c.get(2).equals(email))
					thisContact = c;
			}
		}
		else
		{
			/*TODO return some sort of error information to user
			 * something like
			 * return "which droids are you looking for?"
			 */
			
		}
		
		
		if(thisContact != null)
			switch (target)
			{
				case "name":
					output = "The contact's name is: " + thisContact.get(0);
					break;
				case "number":
					output = "The contact's number is: " + thisContact.get(1);
					break;
				case "email":
					output = "The contact's email is: " + thisContact.get(2);
					break;
			}
		
		return output;
	}
}

class Add
{
	
}

class Remove
{
	
}

class Read
{
	
}

class Send
{
	
}

class Call
{
	
}
