import java.awt.Color;

public abstract class Plant extends LifeForm {

	public Plant(Location loc, World w) {
		super(loc, w, 1);
		myColor = Color.green;
	}
}
