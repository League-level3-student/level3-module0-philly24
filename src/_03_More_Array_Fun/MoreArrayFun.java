package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {

		printString();
		reversePrint();
		otherPrint();
		randomPrint();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void printString() {
		String[] names = new String[3];
		names[0] = "mike";
		names[1] = "kobe";
		names[2] = "lebron";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void reversePrint() {
		String[] food = new String[3];
		food[0] = "apple";
		food[1] = "orange";
		food[2] = "pear";
		for (int i = food.length - 1; i >= 0; i--) {
			System.out.println(food[i]);
		}
	}
	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void otherPrint() {
		String[] teams = new String[6];
		teams[0] = "lakers";
		teams[1] = "heat";
		teams[2] = "okc";
		teams[3] = "Raps";
		teams[4] = "bucks";
		teams[5] = "knicks";
		for (int i = 0; i < teams.length; i+=2) {
				System.out.println(teams[i]);
		}
	}
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	static void randomPrint() {
		String[] letters = new String[4];
		letters[0] = "a";
		letters[1] = "b";
		letters[2] = "c";
		letters[3] = "d";
		
		for (int i = 0; i < letters.length; i++) {
			Random randy = new Random();
			int rand = randy.nextInt(4);
			i = rand;
			System.out.println(letters[i]);
		}
	}
}
