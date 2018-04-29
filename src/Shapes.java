import org.jointheleague.graphical.robot.Robot;

public class Shapes {
	  String shape = "";
	  String imgUrl = "";
	  Robot R5D5;
	
	public String getShape() {
		return this.shape;
	  }  public String getImgUrl() {
		return this.imgUrl;
	       }
	
	public void setShape(String shape) {
		this.shape = shape;
	  }  public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
		R5D5.changeRobot(imgUrl);
	       }
	  
		public void draw() {
			R5D5.penDown();
			R5D5.setSpeed(100);
			   if( shape == "circle") {
				   R5D5.moveTo(100, 100);
				   for(int i = 1; i <= 360; i++) {
				   R5D5.move(1);
				   R5D5.turn(1);
				   }
			    }
			   else if( shape == "square" ) {
				   R5D5.moveTo(300, 300);
				   for(int i = 1; i <= 4; i ++) {
					   R5D5.move(100);
					   R5D5.turn(90);
				   }
			   }
			   else if(shape == "triangle") {
				   R5D5.moveTo(500, 500);
				   for(int i = 1; i <= 3; i ++) {
					   R5D5.move(100);
					   R5D5.turn(120);				   
				   }
			   }
			   R5D5.moveTo(100, 500);
	    }
		
		Shapes(String imgUrl , String shape){
			R5D5 = new Robot();
			this.shape = shape;
			this.imgUrl = imgUrl;
			R5D5.changeRobot(imgUrl);
		}
	
}
