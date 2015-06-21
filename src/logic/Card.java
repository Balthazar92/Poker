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
	
	private int value;
	private int color;
	
	public Card(){
		this.value = -1;
		this.color = -1;
	}
	
	public Card(int value, int color){
		this.value = value;
		this.color = color;
	}
	
	public int get_value(){
		return value;
	}
	
	public int get_color(){
		return color;
	}
}
