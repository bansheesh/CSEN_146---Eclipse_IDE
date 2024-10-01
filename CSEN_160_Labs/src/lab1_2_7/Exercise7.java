package lab1_2_7;

public class Exercise7 {
	public static void genRandNum(int range, int count){
		
		System.out.print("Random numbers: ");
		
		//create array to hold numbers
		int randNums[] = new int[count];
		
		//generate numbers within the range and count, and place inside array
		for (int i = 0; i < count; i++) {
			randNums[i] = (int) (range * Math.random());
			System.out.print(randNums[i]+ " ");  //print array
		}
		
		//print count
		System.out.println();
		System.out.print("Count: " +count);
	}
	public static void main (String [] args){
		// Generate 10 numbers in the range of 0-10
		Exercise7.genRandNum(10, 10);
		}
}
