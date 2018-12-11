package untils;

import java.util.Scanner;

public class ConsoleReader {
	
	private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public ConsoleReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     * @param string 
     *
     * @return  A String typed by the user.
     */
    public String getInput(String string)
    {
        System.out.print(string + "> ");         // print prompt
        String inputLine = reader.nextLine();
        reader.nextLine();
        return inputLine;
    }
    
    
    /**
     * Only reads the next token and not the whole line. This is useful if a user
     * only has to enter a digit.
     * 
     * @return  A number typed by the user.
     */
    public int getInt(String string){
    	System.out.print(string + "> ");         // print prompt
        int input = reader.nextInt();
        reader.nextLine();
        return input;
    }
	

	
	

}

