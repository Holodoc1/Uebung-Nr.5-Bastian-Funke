package p1;

public class P1_Main {

	public static void main(String[] args) {
		int x = 0;
		while(x <= 10) {
			x = x + 1;
			System.out.println(x);
		}
		System.out.println();
		for(int i = 1; i <= 11; i++) {
			System.out.println(i);
		}
		System.out.println();
		x = 0;
		do {
			x += 1;
			System.out.println(x);
		} while(x <= 10);
	}
	
}
