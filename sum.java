package Functions;

import java.util.Scanner;

public class sum {

	public static int sum(int x, int y) {
		int z = x+y;
		return z;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int z = sum(x,y);
		System.out.println(z);

	}

}
