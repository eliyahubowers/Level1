
public class backpack1 {
	public static void main(String[] args) {
		Backpack B = new Backpack();
		Pencil p = new Pencil();
		Ruler r = new Ruler();
		Textbook t = new Textbook();
		B.putInBackpack(p);
		B.putInBackpack(r);
		B.putInBackpack(t);
		B.goToSchool();
		t.read();
		p.write("I hate this boring textbook.");
		r.measure();
		p.write("This isnt any better.");
	}
}
