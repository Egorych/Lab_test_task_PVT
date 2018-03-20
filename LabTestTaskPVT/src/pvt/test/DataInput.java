package pvt.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataInput {

	public static ArrayList<Integer> sequenceReading() {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the sequence of numbers via space:");
			String strOfNumbers = reader.readLine();
			List<Integer> sequenceOfNumbers = new ArrayList<Integer>();
			if (strOfNumbers.length() != 0) {
				for (String number : strOfNumbers.split(" ")) {
					try {
						sequenceOfNumbers.add(Integer.parseInt(number));
					} catch (NumberFormatException e) {
						System.out.println("You have to enter only integers!!");
						DataInput.sequenceReading();
					}
				}

			} else {
				System.out.println("You have to enter one number at least in sequence!!");
				DataInput.sequenceReading();
			}
			return (ArrayList<Integer>) sequenceOfNumbers;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

}
