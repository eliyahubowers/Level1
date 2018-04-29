import org.jointheleague.graphical.robot.Robot;

public class ShapesRunner {
	public static void main(String[] args) {
		Shapes s = new Shapes("http://www.kinyu-z.net/data/wallpapers/35/823942.jpg","circle");
		s.draw();
		s.setShape("triangle");
		s.draw();
		s.setShape("square");
		s.draw();	
	}
}
