package JavaFinalProject;

public class App {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck deck = new Deck();
		Player player1 = new Player("Julia");
		Player player2 = new Player("Anna");
		
		deck.shuffle();
		
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.println("Round number " + (i+1));
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			System.out.print(player1.getName() + " has flipped this card: ");
			player1Card.describe();
			System.out.print(player2.getName() + " has flipped this card: ");
			player2Card.describe();
			if (player1Card.getValue() > player2Card.getValue()) {
				System.out.println();
				player1.describe();
				System.out.println(player1.getName() + " gets a point!");
				player1.incrementScore();
			} else if (player1Card.getValue() < player2Card.getValue()) {
				System.out.println();
				player2.describe();
				System.out.println(player2.getName() + " gets a point!");
				player2.incrementScore();
			} else {
				System.out.println("Tie! No points");
			}
			System.out.println("\n");
		}
		
		
		System.out.printf(player1.getName() + " score = %d\n", player1.getScore());
		System.out.printf(player2.getName() +  " score = %d\n", player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " is the winner!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName()  + " is the winner!");
		} else {
			System.out.println("There's no winner in WAR!");
		}
		
	}

}
