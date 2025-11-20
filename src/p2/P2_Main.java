package p2;

public class P2_Main {

	public static void main(String[] args) {
		int[] numbers = {1,-8000,5};
		int max = 66;
		int minIndex = 6;
		max = numbers[0];
		minIndex = 0;
		System.out.print("numbers: " + numbers[0]);
		int i;
		for(i = 1; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
				minIndex = i;
			}
			System.out.print("," + numbers[i]);
		}
		System.out.println();
		System.out.println("Maximum: " + max);
		System.out.println("MinIndex: " + minIndex);
	}
	
}
