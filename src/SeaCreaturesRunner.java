
public class SeaCreaturesRunner {
	public static void main(String[] args) {
		SeaCreatures S = new SeaCreatures("Spongebob");
		SeaCreatures Sq = new SeaCreatures("Squidward");
		SeaCreatures P = new SeaCreatures("Patrick");
		for(int o = 0; o <100; o ++) {
		S.eat();
		Sq.eat();
		P.eat();
		S.laugh();
		Sq.laugh();
		P.laugh();
		}
	}
}
