package parrayutilities;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExampleApp
{

	public static void main(String[] args)
	{
		int[] myArray;
		int index = 0; // set pointer to beginning of array
		// create your array here
		myArray = new int[1000];

		// creating the File instance
		File text = new File("rand.txt");
		try
		{
			// creating the Scanner instance
			Scanner scan = new Scanner(text);

			while (scan.hasNextLine() && index < 1000)
			{
				// turn the input into an integer
				myArray[index] = scan.nextInt();
				index++;
			}
			scan.close();
		} catch (IOException e)
		{
			System.out.println("There was a problem with the file");
			e.printStackTrace();
		} catch (NumberFormatException ne)
		{
			System.out.println("Not a number");
		}
		for (int item : myArray)
		{
			System.out.println(item);
		}

	}

}
