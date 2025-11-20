package h3;

public class H3_Main {

	public static void main(String[] args) {
		int[][] einheiten = {{50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1},
							 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		int input = 95367;
		System.out.println("Geldbetrag: " + input);
		int i;
		System.out.print("Scheine und Münzen: |");
		for(i = 0; i < einheiten[0].length; i++) {
			System.out.print(einheiten[0][i] + "|");
			while(input >= einheiten[0][i]) {
				einheiten[1][i] += 1;
				input -= einheiten[0][i];
			}
		}
		
		System.out.println();
		System.out.print("Anzahl:             |");
		int j;
		String stringScheine;
		for(i = 0; i < einheiten[1].length; i++) {
			stringScheine = Integer.toString(einheiten[0][i]);
			for(j = 0; j < stringScheine.length() - 1; j++) {
				System.out.print(" ");
			}
			System.out.print(einheiten[1][i] + "|");
		}
	}
}
