package video3;

public class Variables {
	int x = 5;
	String s="pepe";
	public Variables() {
		
	}
	public int getVariable() {
		return this.x;
	}
	public String getPalabra() {
		return this.s;
	}
	public static void main(String[] args) {
		Variables v = new Variables();
		System.out.println(v.getVariable() +" "+ v.getPalabra());
	}
}
