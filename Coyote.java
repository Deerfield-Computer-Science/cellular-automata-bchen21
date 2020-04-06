import java.awt.Color;

import acm.util.RandomGenerator;

public class Coyote extends LifeForm {
	
	public Coyote(Location loc, World w) {
		super(15, 3, loc, Color.CYAN, w);
	}
	
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new Coyote(new Location(newX,newY), myWorld));
	}
	
	public void moveCreature() {
		
		int newX = getMyLocation().getX()+rgen.nextInt(-2, 2);
		int newY = getMyLocation().getY()+rgen.nextInt(-2, 2);
		
		Location newLocation = new Location(newX, newY);
		
		setMyLocation(newLocation);
		
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
