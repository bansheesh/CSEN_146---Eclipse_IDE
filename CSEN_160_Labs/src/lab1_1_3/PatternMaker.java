package lab1_1_3;

public class PatternMaker {
	public static void drawOneLine(char symbol, int noOfTimes, int offset){
		for (int i = 0; i < offset; i++) {
			System.out.print(" "); // print space offset times
		}
		for (int i = 0; i < noOfTimes; i++) {
			System.out.print(""+symbol); //print symbol noOfTimes times
		}
		System.out.println(); //new line
	}
	public static void drawPattern(){
		drawOneLine('*',4,4); //  4 blank spaces followed by 4 stars.
		drawOneLine('*',8,8); // 8 blank spaces followed by 8 stars.
		drawOneLine('*',12,12); // 12 blank spaces followed by 12 stars.
	}
	public static void main (String [] args){
		drawPattern();
		return;
	}
}
