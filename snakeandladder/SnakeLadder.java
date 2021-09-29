package snakeandladder;

public class SnakeLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static void main(String[] args) {
		int playerOnePosition = 0, playerTwoPosition = 0;
		int diecount1 = 0, diecount2 = 0;
		int newPosition = 0;
		int option;
		int currentPlayer = 1;
		while (true)
		{
			if (currentPlayer == 1)
			{
				System.out.println("Now it's player-1 turn");
				diecount1++;
				int diceNumber = (int) Math.floor(Math.random()*6) +1;
				System.out.println("The dice number=" +diceNumber);
				option = (int) Math.floor(Math.random() * 3);
				System.out.println("The option is=" +option);
				switch (option)
				{
				case NO_PLAY:
					newPosition = 0;
					break;
				case LADDER:
					newPosition = diceNumber;
					break;
				case SNAKE:
					newPosition = -diceNumber;
					break;
				}
				playerOnePosition = playerOnePosition + newPosition;
				if (playerOnePosition < 0)
				{
					playerOnePosition =0;
				}
				if (playerOnePosition > 100)
				{
					playerOnePosition = newPosition;
				}
				System.out.println("Now player-1 at " +playerOnePosition + " position");
				if (playerOnePosition == 100)
				{
					break;
				}
			}
			else
			{
				System.out.println("Now it's player-2 turn");
				diecount2++;
				int diceNumber = (int) Math.floor(Math.random() *6) +1;
				System.out.println("The dice number=" +diceNumber);
				option = (int) Math.floor(Math.random() *3);
				System.out.println("The option is=" +option);
				switch (option)
				{
				case NO_PLAY:
					newPosition = 0;
				case LADDER:
					newPosition = diceNumber;
					break;
				case SNAKE:
					newPosition = -diceNumber;
					break;
				}
				playerTwoPosition = playerTwoPosition + newPosition;
				if (playerTwoPosition < 0)
				{
					playerTwoPosition = 0;
				}
				if (playerTwoPosition > 100)
				{
					playerTwoPosition = newPosition;
				}
				System.out.println("Now player-2 at " +playerTwoPosition +  " position");
				if (playerTwoPosition == 100)
				{
					break;
				}
			}
			if (option == 1)
			{
				System.out.println("You got ladder. Now play again.");
			}
			else
			{
				if (currentPlayer == 1)
				{
					currentPlayer = 2;
				}
				else
				{
					currentPlayer = 1;
				}
			}
		}
		if (playerOnePosition == 100)
		{
			System.out.println("\nCongratulation player-1 won! \n after die rolled " + diecount1 + " times");
		}
		else
		{
			System.out.println("\nCongratulation player-2 won! \n after die rolled " + diecount2 + " times");
		}
	}
}