package logic;

public class Card {
	public static final int JACK = 11;
	public static final int LADY = 12;
	public static final int KING = 13;
	public static final int ACE = 14;
	public static final int SPADES = 0;
	public static final int BAPTIZE = 1;
	public static final int DIAMONDS = 2;
	public static final int HEART = 3;
	
	public int value;
	public int color;
	
	public Card(int value, int color){
		this.value = value;
		this.color = color;
	}
}
