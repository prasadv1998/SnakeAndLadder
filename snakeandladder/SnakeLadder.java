package snakeandladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder");
		System.out.println("Player at position 0");
		int dice = (int) (Math.random() *6) +1;
		System.out.println("Dice number is:" +dice);
		int ladder = 1;
		int snake = 2;
		int presentPosition = 4;
		int option = (int) (Math.random() *3);
		System.out.println("Your present position:" +presentPosition);
		System.out.println("You got option:" +option);
		if (option == ladder)
			{	
			presentPosition += dice;
			System.out.println("You are at position:" +presentPosition);
			}
		else if (option == snake)
			{	
			presentPosition -= dice;
			System.out.println("You are at position:" +presentPosition);
			}
		else
			{	
			System.out.println("You are at position:" +presentPosition);
			}
	}
}