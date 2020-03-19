import java.io.*;
import java.util.*;

public class Input {
	/**
	 * The main method reads lines from a file 
	 * and puts them into an array.
	 *
	 */
	 
	static int[] myArray ;
	static int index;

	public static void main(String[] args) {
		
			
		BufferedReader in;
		
		//create your array here
		myArray =  new int[1000];

		String line;
		int index = 0; //set pointer to beginning of array
		try	{
			in = new BufferedReader(new FileReader("rand.txt"));
			while (((line = in.readLine())!= null)&& index < 1000){
				//turn the input into an integer
				myArray[index] = Integer.parseInt(line);
				index++;
			}
			
		}	
		catch (IOException e){
			System.out.println("There was a problem with the file");
			e.printStackTrace();
		}catch (NumberFormatException ne) {
			System.out.println("Not a number");
			ne.printStackTrace();
		}
	}