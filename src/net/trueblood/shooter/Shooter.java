package net.trueblood.shooter;

public class Shooter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Menagerie menagerie = new Menagerie();
		menagerie.add(new Monster("Goblin",10));
		menagerie.add(new Monster("Orc",10));
		menagerie.add(new Monster("Dragon",100));
		
		System.out.println("You see a " + menagerie.getRandomMonster().getName());
	}

}
