package video5;

import java.util.Scanner;

public class Metodos {

	public Metodos() {
		// TODO Auto-generated constructor stub
	}

	public static int sumar(int a,int b) {
		return (a + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int a = Integer.parseInt(input);
		input = s.nextLine();
		int b = Integer.parseInt(input);
		System.out.println(new Metodos().sumar(a, b));
	}

}
