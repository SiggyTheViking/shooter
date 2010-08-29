package net.trueblood.shooter;

public class Monster {
	private String _name;
	private int _hitPoints;
	private final int _fullHealth;
	private boolean _isAlive = true;
	private int _location = 0;
	
	public Monster(String name, int hp){
		_name = name;
		_hitPoints = hp;
		_fullHealth = hp;
	}
	public Monster(String name, int hp, int location){
		_name = name;
		_hitPoints = hp;
		_location = location;
		_fullHealth = hp;
	}
	
	public String getName(){
		return _name;
	}
	public int getHitPoints(){
		return _hitPoints;
	}
	public int getLocation(){
		return _location;
	}
	public void setLocation(int location){
		_location = location;
	}
	
	//returns true if monster is still alive,
	//false if killed
	public double DoDammage(int dammage){
		_hitPoints = _hitPoints - dammage;
		if (_hitPoints < 1){
			_isAlive = false;
		}
		if (_hitPoints == 0){
			return 0;
		}
		else{
			return _hitPoints / _fullHealth;
		}
	}

}
