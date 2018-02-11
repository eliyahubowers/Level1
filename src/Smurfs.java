
public class Smurfs {

	/*
	 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g 2.
	 * In a Runner class, make a Handy Smurf. Use the methods below to make him eat,
	 * and print his name.
	 * 
	 * 5. Make a Papa Smurf and print his name, hat color and girl or boy. 6. Make a
	 * Smurfette and print her name, hat color and girl or boy.
	 */
	public static void main(String[] args) {

		Smurfs Handysmurf = new Smurfs("Handysmurf");
		Handysmurf.eat();
		Handysmurf.getName();

		Smurfs papasmurf = new Smurfs("papasmurf");

	}

	private String name;

	Smurfs(String name) {
		this.name = name;

	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		String s;
		// 3. Fill in this method
		if(name == "papasmurf") {
		s = "red";
		}else{
			s = "white";
		}
		return s;
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		String gb;
		if(name == "Smurfette") {
			gb = "girl";
		}else {
			gb = "boy";
		}
		return gb;
	}

}
