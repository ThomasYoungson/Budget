
/**
 * Used to work out how much money you have after one weeks earnings.
 */

import java.util.Scanner;
import java.io.*;
import java.util.Date;

/**
 * @author Thomas Youngson
 *
 */
public class Budget {

	private static final String FILENAME = "budget.txt";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		writeToFile(getInput());
	}
	
	/*
	 * Gets a input from a user and works out what they have left over for the 
	 * week.
	 * 
	 * @returns string of the date, total budget and money left over.
	 */
	public static String getInput() {

		double total_budget = 0;
		String line = "";

		Scanner sc = new Scanner(System.in);
		Date date = new Date();

		System.out.println("----------Weekly Budget----------");

		System.out.print("Income w/: $");
		double work_income = sc.nextDouble();
		System.out.print("Extra Income w/: $");
		double extra_income = sc.nextDouble();

		System.out.print("Rent Cost w/: $");
		double rent_cost = sc.nextDouble();
		System.out.print("Food Cost w/: $");
		double food_cost = sc.nextDouble();
		System.out.print("Power Cost m/: $");
		double power_cost = sc.nextDouble();
		System.out.print("Internet Cost m/: $");
		double internet_cost = sc.nextDouble();
		System.out.print("Fuel Cost w/: $");
		double fuel_cost = sc.nextDouble();
		System.out.print("Savings w/: $");
		double savings = sc.nextDouble();

		total_budget = extra_income + work_income;
		double weekly = fuel_cost - food_cost - rent_cost - savings;
		double monthly = (power_cost + internet_cost) / 4;
		double left_over = total_budget + (weekly - monthly);

		line += (date.toString());
		line += ("\n" + Double.toString(total_budget));
		line += ("\n" + Double.toString(left_over) + "\n");

		sc.close();

		return line;
	}

	/*
	 * Writes the returned values from getInput to a file.
	 * File write layout is:
	 * 		- Date
	 * 		- Total Budget
	 * 		- Left Over
	 */
	public static void writeToFile(String input_stream) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			String content = input_stream;
			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}

}
