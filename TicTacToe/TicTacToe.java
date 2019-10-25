/* OUTCOME: User will be asked to enter the location for X user and then Y user and vice versa.
            Accordingly if user if found at any stage then it will be displayed on screen else "Nobody won" will be displayed.
			It takes minimum 5 moves to decide whether user won the game or not. so After 5 moves it will check for combinations all X's or O's using different angles.
			At the end of the game user will asked whether he want to restart the game or not.
            Exceptions and all possible conditions are also used in this code.
   
   POSSIBLE CONDITIONS CONSIDERED:
       1: Input during game must be between 0 to 9.
       2: Already marked location can't be overwritten by current player
       3: At the when winner gets declared, user will be asked to choose whether he/she wants to reset the game or not?
          If 1: "GAME RESETS" will be printed and users can continue with new game board.
          If 0: "THANKS FOR PLAYING TIC-TAC-TOE.
                  HOPE YOU ENJOYED IT!" will be printed.
          Integer/Other: "Please enter either 0 or 1" will be printed and loop will continue until user enter either 0 or 1 or any other non integer value.
   NOTE: For recommendation / feedback, EMAIL: supriya23797@gmail.com 
*/

package t3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TicTacToe 
{
	private static int ch=1;
	//Initialize scanner on class level
	private static Scanner scanner = new Scanner(System.in);
	
	//Declare 3X3 board
	private static String[][] board = new String[3][3];
	
	//Initialize board values starting with 0 to 8
	TicTacToe()
	{		
		int board_position = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
			{
				board[i][j] = "" + board_position ;
				board_position++;
			}
	}
	
	//Display current board positions
	private static void show_board()
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	//
	private static void operation()
	{
		boolean winner_found = false;
		boolean x_as_input = true;

		//Call method that display board
		show_board();

		//Player counter will count the total moves done by both users
		int player_turn_counter = 0;
		while (!winner_found)
		{	
			int input_location;
			boolean input_taken = false;

			while (!input_taken)
			{					
			    if (x_as_input)
					System.out.print("X ");
				else 
					System.out.print("O ");
				
				//Taking input location from user
				System.out.print("please enter location: ");
				input_location = scanner.nextInt();

				//Calculate the actual row and col location on board
				int row = input_location / 3;
				int col = input_location % 3;

				/*Checking if 1: is input falls between -1 and 9
				              2: is entered position unmarked*/ 
				if (input_location < 9 && input_location > -1 && ! (board[row][col].equals("X") || board[row][col].equals("O")))
				{
					//Update board
					if (x_as_input)
						board[row][col] = "X";
					else 
						board[row][col] = "O";
			
					player_turn_counter++;
					input_taken = true;
				}
			}

			//Print the board after user input
			show_board();

			//checking if minimum 5 inputs are entered by both users combined. NOTE: because it takes minimum 5 moves to win this game
			if(player_turn_counter>4) 
			{
				//set winner_found to "true" if winner is found else set it to "false"
				winner_found = checkWin(player_turn_counter);
			}

			
			//reset x_as_input
			x_as_input = !x_as_input;

		}
	}
	
	//Check for winner_found
	private static boolean checkWin(int board_positioner)
	{
		//Checking for winner in rows
		for (int row = 0; row < 3; row++) 
		{
	        if (board[row][0] == board[row][1] && board[row][1] == board[row][2])
	        {
	        	System.out.println(board[row][0] + " wins");
	            return true;
	        }
	    }
	    //Checking for winner in columns
	    for (int col = 0; col < 3; col++) 
	    {
	        if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) 
	        {
	        	System.out.println(board[0][col] + " wins");
	            return true;
	        }
	    }
	    //Checking for winner in diagonally
	    if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
	    {
	    	System.out.println(board[0][0] + " wins");
	        return true;
	    }

	    if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
	    {
	    	System.out.println(board[0][2] + " wins");
	        return true;
	    }

	    //Check if no winner found i.e. if last input is taken and still if no winner found using above conditions
	    else if (board_positioner == 9)
		{
			System.out.println("Nobody Won");
			return true;
		}
	    else
	    {
	    	return false;
	    }
	}
	
	public static void main(String[] args)
	{
		do
		{
			TicTacToe t=new TicTacToe();
			try
			{
				TicTacToe.operation();
				System.out.print("Press 1 if you want to replay the game: ");
				while(ch!=0 || ch!=1) 
				{
					ch=scanner.nextInt();
					if(ch==1)
					{
						System.out.println("\nGAME RESETS\n");
					}
					else if(ch==0)
					{
						System.out.println("\nTHANKS FOR PLAYING TIC-TAC-TOE.\n HOPE YOU ENJOYED IT!");
					}
					else
					{
						System.out.print("\nPlease enter either 0 or 1:");
					}
				}//end while
			}//end try
			catch(InputMismatchException e)
			{
				System.out.println("\nWrong input entered. Please restart game");
				System.exit(0);
			}
		}while(ch==1);
	}//End PSVM
}//End class