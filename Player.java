package JavaFinalProject;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void describe() {
		System.out.println("Player " + name + " has a score of " + score + " and this in their hand: ");
		for (Card card : hand) {
		card.describe();
		}
	}
	
	public Card flip() {
		if (hand.isEmpty()) {
			return null;
		} else {
		return hand.remove(0);
		}
	}

	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}

	
}
