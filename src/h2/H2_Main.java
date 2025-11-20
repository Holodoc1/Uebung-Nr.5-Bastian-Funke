package h2;

public class H2_Main {

	public static void main(String[] args) {
		int n = 299;
		int digits = 5000;
		int[] a = {1,2,3,4,5,6,7,8,9};
		a = new int[9];
		String stringN;
		stringN = Integer.toString(n);
		
		digits = stringN.length();
		
		int i;
		int j;
		String temp;
		for(i = a.length - 1, j = 0; i > ((a.length - 1) - digits); i--, j++) {
			temp = stringN.substring(digits - 1 - j, digits - j);
			a[i] = Integer.parseInt(temp);
		}
		
		System.out.println("n: " + n);
		System.out.println("Ziffern: " + digits);
		System.out.print("a: |");
		for(i = 0; i < a.length; i++) {
			System.out.print(a[i] + "|");
		}
	}
	
}
