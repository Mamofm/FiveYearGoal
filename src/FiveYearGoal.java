/* Robert is working on his 5-year goal - to increase his current $62,000 annual income by 10% each year.
Write a pseudocode in a README.md file, first. Then, write an application that will calculate his annual income on the fifth year.
Psuedo code
1. prompt user for currentSalary
2. prompt user for yearlyRateIncrease
3. calculate yearly Increase Amount
4. add yearlyIncreaseAmount to current Salary
5. repeat step  3 and 4 for 5 years
 */

import java.util.Scanner;
public class FiveYearGoal {
    public static void main(String[] args) {
        double currentSalary;
        double yearlyRateIncrease;

        Scanner input = new Scanner(System.in);
        System.out.println("Input your current Salary: ");

        currentSalary = input.nextDouble();
        System.out.println("Input Yearly Interest : ");
        yearlyRateIncrease = input.nextDouble();

        currentSalary = currentSalary + (currentSalary*yearlyRateIncrease);  // year 1
        currentSalary = currentSalary + (currentSalary*yearlyRateIncrease);  // year 2
        currentSalary = currentSalary + (currentSalary*yearlyRateIncrease);  // year 3
        currentSalary = currentSalary + (currentSalary*yearlyRateIncrease);  // year 4
        currentSalary = currentSalary + (currentSalary*yearlyRateIncrease);  // year 5

        System.out.println("your Salary after 5 year will be: " + currentSalary);
    }
}
