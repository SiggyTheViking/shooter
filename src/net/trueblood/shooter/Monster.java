package net.trueblood.shooter;

public class Monster {
	private String _name;
	private int _hitPoints;
	private boolean _isAlive = true;
	//private int _location;
	
	public Monster(String name, int hp){
		_name = name;
		_hitPoints = hp;
	}
	
	public String getName(){
		return _name;
	}
	public int getHitPoints(){
		return _hitPoints;
	}
	
	//returns true if monster is still alive,
	//false if killed
	public boolean DoDammage(int dammage){
		_hitPoints = _hitPoints - dammage;
		if (_hitPoints < 1){
			_isAlive = false;
		}
		return _isAlive;
	}

}
