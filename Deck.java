package JavaFinalProject;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	
	private ArrayList<Card> cards;
	
		public Deck() {
			cards = new ArrayList<>();
			populateDeck();	
		}	
		
		
	private void populateDeck() {
		String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		
		for (String suit : suits) {
			for (int i = 0; i < ranks.length; i++) {
				int value = i + 2;
				cards.add(new Card(value + 2, ranks[i] + " of " + suit));
			}
		}
	}
		
		
		public void shuffle() {
			Collections.shuffle(cards);
		}
		
		public Card draw() {
			if (cards.isEmpty()) {
				return null;
			} else {
				return cards.remove(0);
			}
		}
		
		
		
		
}
	
		
	

