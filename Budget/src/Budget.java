/**
 * Used to work out how much money you have after one weeks earnings.
 */

import java.util.Scanner;
import java.util.Date;

/**
 * @author Thomas Youngson
 *
 */
public class Budget {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String budget_result = getInput();
		
		System.out.println("\n" + budget_result); 
	}
	
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
        double weekly = fuel_cost-food_cost-rent_cost-savings;
        double monthly = (power_cost+internet_cost)/4;
        double left_over = total_budget+(weekly-monthly);

        line += ("Date: " + date.toString());
        line += ("\nTotal budget: $" + Double.toString(total_budget));
        line += ("\nLeft over: $" + Double.toString(left_over));
        
        sc.close();
        
        return line;
	}

}
