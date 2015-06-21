package game;

import logic.Card;

public class Player {
	public static final int HAND_SIZE = 2;
	private String name;
	private int money;
	private int position;
	private Card hand[];
	
	public Player(String name, int money, int position){
		this.name = name;
		this.money = money;
		this.position = position;
		hand = new Card[HAND_SIZE];
	}
	
	public void set_hand(Card pair[]){
		hand[0] = pair[0];
		hand[1] = pair[1];
	}
	
	public Card[] get_hand(){
		return hand;
	}
	
	public String get_name(){
		return name;
	}
	
	public int get_money(){
		return money;
	}
	
	public int get_position(){
		return position;
	}
	
}
