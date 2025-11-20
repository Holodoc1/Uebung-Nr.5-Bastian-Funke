package h1;

public class H1_Main {

	public static void main(String[] args) {
		int[] myArray = {5,6,7,6,10,11,12};
		int i;
		int temp;
		for(i = 0; i < (myArray.length/2); i++) {
			temp = myArray[i];
			myArray[i] = myArray[myArray.length - 1 - i];
			myArray[myArray.length - 1 - i] = temp;			
		}
		System.out.print("myArray: " + myArray[0]);
		for(i = 1; i < myArray.length; i++) {
			System.out.print("|" + myArray[i]);
		}
	}
	
}
