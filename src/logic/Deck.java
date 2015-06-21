package logic;

import java.util.Random;

public class Deck {
	public static final int SIZE = 52;
	private Card cards[];
	private int up_card;
	
	public Deck(){
		up_card = 0;
		cards = new Card[SIZE];
		int i = 0;
		for(int value = 2; value <= Card.ACE; value++){
			for(int color = Card.SPADES; color <= Card.HEART; color++){
				cards[i] = new Card(value, color);
				i++;
			}
		}
	}
	
	public void refresh(){
		up_card = 0;
		Random rand = new Random();
		Card tmp = new Card();
		for(int i = 0; i < 200; i++){
			int card1 = rand.nextInt(SIZE);
			int card2 = rand.nextInt(SIZE);			
			tmp = cards[card1];
			cards[card1] = cards[card2];
			cards[card2] = tmp;
		}
	}
	
	public Card pop(){
		return cards[up_card++];
	}
}
