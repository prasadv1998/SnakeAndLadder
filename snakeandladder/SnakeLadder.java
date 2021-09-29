package snakeandladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Player at position 0");
		int dice = (int) (Math.random() *6) +1;
		System.out.println("Dice number is:" +dice);
	}
}