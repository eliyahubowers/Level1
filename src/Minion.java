public class Minion {
	String name; 
	int eyes; 
	String color; 
	String master;
		Minion(	String name,int eyes,String color,String master){
			this.name = name;
			this.eyes = eyes;
			this.color = color;
			this.master = master;
		}
		
		public String getName() {
			return this.name;		
		}
		public String setName(String name) {
			return this.name=name;
		}
		
		public String getColor() {
			return this.color;		
		}
        public String setColor(String color) {
			return this.color=color;
		}
        
		public String getMaster() {
			return this.master;		
		}
		public String setMaster(String master) {
			return this.master=master;
		}
		
		public int getEyes() {
			return this.eyes;		
		}		
		public int setEyes(int eyes) {
			return this.eyes=eyes;
		}
}