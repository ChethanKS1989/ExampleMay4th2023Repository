package com.sgtesting.mreturn;
class LargestNumber {
	int findLargestNumber(int[] arr) {
		if (arr.length == 0) {

			return -1;
		}

		return arr[arr.length - 1];
	}
}

public class Rdemo7 {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		LargestNumber o1 = new LargestNumber();
		int largestNumber = o1.findLargestNumber(array);

		System.out.println("The largest number in the array is: " + largestNumber);
	}
}

