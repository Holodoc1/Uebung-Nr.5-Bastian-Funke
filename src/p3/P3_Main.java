package p3;

public class P3_Main {

	public static void main(String[] args) {
		int[][] matrix = {{67,68,69},{31,55,60},{77,87,97}};
		int i;
		int j;
		int sum;
		for(i = 0; i < matrix.length; i++) {
			System.out.println("|" + matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2] + "|");
		}
		
		//b)
		System.out.println("b):");
		sum = 0;
		for(i = 0; i < matrix.length; i++) {
			for(j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		System.out.println(sum);
		
		//c)
		System.out.println("c):");
		for(i = 0; i < matrix.length; i++) {
			for(j = i + 1; j < matrix[i].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for(i = 0; i < matrix.length; i++) {
			int temp = matrix[i][0];
			matrix[i][0] = matrix[i][matrix[i].length - 1];
			matrix[i][matrix[i].length - 1] = temp;
		}
		for(i = 0; i < matrix.length
				; i++) {
			System.out.println("|" + matrix[i][0] + " " + matrix[i][1] + " " + matrix[i][2] + "|");
		}
		
		// a)
		int[][] matrix2 = {{67,68,69},{31,55,60},{77,87,97}} ;
		for(i = 0; i < matrix2.length; i++) {
			for(j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j]++;
			}
		}
		System.out.println("a):");
		for(i = 0; i < matrix2.length
				; i++) {
			System.out.println("|" + matrix2[i][0] + " " + matrix2[i][1] + " " + matrix2[i][2] + "|");
		}
	}
}	
	

