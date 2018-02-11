
public class smurf {
	public static void main(String[] args) {
		Smurfs Handysmurf = new Smurfs("Handysmurf");
		System.out.println(Handysmurf.getName());
		Handysmurf.eat();
		
		
		Smurfs papasmurf = new Smurfs("papasmurf");
		System.out.println(papasmurf.getName());
		System.out.println(papasmurf.getHatColor());
		System.out.println(papasmurf.isGirlOrBoy());
		
		Smurfs Smurfette = new Smurfs("Smurfette");
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
