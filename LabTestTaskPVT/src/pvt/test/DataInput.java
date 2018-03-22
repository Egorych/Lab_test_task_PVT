package pvt.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataInput {
	public static ArrayList<Integer> sequenceReading() {
		boolean flag = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> sequenceOfNumbers;

		try {
			do {
				System.out.println("Enter the sequence of numbers via space:");
				String strOfNumbers = reader.readLine();
				String[] strOfNumbersSplit = strOfNumbers.split(" ");
				sequenceOfNumbers = new ArrayList<Integer>();
				if (strOfNumbers.length() != 0) {
					if (strOfNumbersSplit.length < 51) {
						for (String number : strOfNumbersSplit) {
							try {
								sequenceOfNumbers.add(Integer.parseInt(number));
								flag = true;
							} catch (NumberFormatException e) {
								System.out.println("You have to enter only integers!!");
								strOfNumbers = "";
								flag = false;
							}
						}

					} else {
						System.out.println("The sequence can't include more than 50 numbers! Try again");
						DataInput.sequenceReading();
					}
				} else {
					System.out.println("You have to enter one number at least in sequence!!");
					DataInput.sequenceReading();
				}
			} while (!flag);
			return (ArrayList<Integer>) sequenceOfNumbers;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
