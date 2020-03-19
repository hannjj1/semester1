/* words.java
	SDK 1.4
	Dale Parsons
	date
*/

public class  Words
{
	private String message;
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	
// constructors
	public Words(String message) 
	{
	this.message = message;
	int first = message.indexOf("*");
	int sec = message.indexOf("*",first+1);
	int third = message.indexOf("*",sec+1);
	int four = message.indexOf("*",third+1);

	word1 = message.substring(0,first);
	word2 = message.substring(first+1,sec);
	word3 = message.substring(sec+1,third);
	word4 = message.substring(third+1,four);
	
	}

	
//accessor methods

	public String getMessage()
	{
		return message;
	}


// modifier methods

	


//Calculations
	public String exWords()
	{
		
		return word1 + word2 + word3 + word4;
	}

	public String reverseWords()
	{
		
		return word4 + word3 + word2 + word1;
	}


// toString method

	
	{
	}
} //end of class