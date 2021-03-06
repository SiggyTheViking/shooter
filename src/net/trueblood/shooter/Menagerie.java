package net.trueblood.shooter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Menagerie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3925375238697291774L;
	private ArrayList<Monster> _monsters = new ArrayList<Monster>();
	private Random generator = new Random();
	public Menagerie(){
		
	}
	
	public void add(Monster m){
		_monsters.add(m);
	}
	
	public Monster getRandomMonster(){
		return _monsters.get(generator.nextInt(_monsters.size()));
	}

}
