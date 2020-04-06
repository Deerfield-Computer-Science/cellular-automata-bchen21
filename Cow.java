import java.awt.Color;

import acm.util.RandomGenerator;

public class Cow extends LifeForm {
	
	public Cow(Location loc, World w) {
		super(15, 2, loc, Color.MAGENTA, w);
	}
	
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new Cow(new Location(newX,newY), myWorld));
	}
	
	public void moveCreature() {
		
		int newX = getMyLocation().getX()+rgen.nextInt(-1, 1);
		int newY = getMyLocation().getY()+rgen.nextInt(-1, 1);
		
		Location newLocation = new Location(newX, newY);
		
		setMyLocation(newLocation);
		
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
