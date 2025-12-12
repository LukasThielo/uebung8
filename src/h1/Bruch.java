package h1;

public class Bruch{
	public int zaehler;
	public int nenner;
	public Bruch(int zaehler, int nenner) {
		this.zaehler= zaehler;
		this.nenner = nenner;
	}
	
	private int ggT(int x, int y) {
		while(y!=0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
	public void shorten() {
		int ggT= ggT(zaehler, nenner);
		zaehler= zaehler/ggT;
		nenner = nenner /ggT;
	}
	public boolean hasSameValueAs(Bruch b) {
		return this.zaehler * b.nenner == this.nenner * b.zaehler;  
	}
	
}
