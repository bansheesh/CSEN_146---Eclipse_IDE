package edu.scu.coen160.lab2;
/**
 * @(#)Stack.java
 */
class Array {
	private int[] itemList = null;
	private int maxLength = -1;
	private int index = -1;
	
	//constructor
	public Array(int maxLength) {
		this.maxLength = maxLength;
		this.itemList = new int[this.maxLength];
		this.index=0;
	}

	public void add(int element) {
		if (this.index < this.maxLength && this.index >= 0) {
			this.itemList[this.index++] = element;
		}
	}

	public int remove() {
		if (this.index < this.maxLength && this.index >= 0) {
			this.index=this.index-1;
			return this.itemList[this.index];
		}else {
			return -1;
		}
	}

	public int[] returnArray() {
		int[] retArr=new int[this.index];
		for (int i = 0; i < this.index; ++i)
			retArr[i]=this.itemList[i];
		
		return retArr;
	}	
}

class Stack {
	private Array myArr=null;
	
	//constructor
	public Stack(int maxLength) {
		// Create Array with maximum length
		myArr = new Array(maxLength);
	}

	public void push(int value) {
		// push one object to the array
		myArr.add(value);
	}

	public int pop() {
		// Remove one object
		myArr.remove();
		return -1;
	}

	public void showStack() {
		// Show the elements in the order of LIFO
		int [] showArr = myArr.returnArray();
		for(int i = 0; i < showArr.length - 1; i ++)
			System.out.println(showArr);
	}
}

public class Q1 {
	public static void q1() {
		Stack myStack = new Stack(30);

		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);

		int pop1=myStack.pop();
		if (pop1 != 40) {
			System.out.println("ERROR_01: 40 expected, but "+pop1+" received!");
			return;
		}
			
		myStack.push(4711);
		int pop2=myStack.pop();
		if (pop2 != 4711) {
			System.out.println("ERROR_02: 4711 expected, but "+pop2+" received!");
			return;
		}
		
		int pop3=myStack.pop();
		if (pop3 != 30) {
			System.out.println("ERROR_03: 30 expected, but "+pop3+" received!");
			return;
		}

		myStack.showStack();
	}
}
