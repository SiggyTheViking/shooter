package net.trueblood.shooter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Map;

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
		//Map<String,String[]> monsters = new Map<String, String[]>();
		String fileName = "menagerie.ser";
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try
		{
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(menagerie);
			out.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}

		System.out.println("You see a " + menagerie.getRandomMonster().getName());
	}

}
