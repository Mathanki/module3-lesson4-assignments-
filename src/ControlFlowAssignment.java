import java.util.Scanner;

public class ControlFlowAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("===============question1================================");
        question1();
        System.out.println("=================question2==============================");
        question2();
        System.out.println("=================question3==============================");
        question3();
        System.out.println("=================question4==============================");
        question4();
        System.out.println("=================question5==============================");

        System.out.println("Please enter your score:");
        int score = scanner.nextInt();
        question5(score);
        System.out.println("=================question6==============================");

        System.out.print("Enter number between 1 and 7: ");
        int dayNumber = scanner.nextInt();
        question6(dayNumber);
        */

        System.out.println("=================question7==============================");

        System.out.println("Enter your filing status (Single, Married Filing Jointly, Married Filing Separately, " +
                "Head of Household): ");
        String status = scanner.nextLine();
        System.out.println("Enter your taxable income: ");
        double taxableIncome = scanner.nextDouble();
        double tax = question7(status, taxableIncome);
        System.out.println("Your tax is: $" + tax);

    }

    /**
     * Write a program that declares 1 integer variable x, and then assigns 7 to it.
     * Write an if statement to print out “Less than 10” if x is less than 10. Change x
     * to equal 15, and notice the result (console should not display anything).
     */
    public static void question1() {
        int x = 7;
        if (x < 10) {
            System.out.println(x + " Less than 10");
        }
        // Change x to 15
        x = 15;
        if (x < 10) {
            System.out.println(x + " Less than 10");
        }
    }

    /**
     * Write a program that declares 1 integer variable x, and then assigns 7 to it.
     * Write an if-else statement that prints out “Less than 10” if x is less than 10,
     * and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
     */
    public static void question2() {
        int x = 7;
        if (x < 10) {
            System.out.println(x + " Less than 10");
        } else {
            System.out.println(x + " Greater than 10");
        }
        x = 15;
        if (x < 10) {
            System.out.println(x + " Less than 10");
        } else {
            System.out.println(x + " Greater than 10");
        }
    }

    /**
     * Write a program that declares 1 integer variable x, and then assigns 15 to it.
     * Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
     * “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or
     * equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
     */
    public static void question3() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println(x + " Between 10 and 20");
        } else if(x >= 20) {
            System.out.println(x + " Greater than or equal to 20");
        }
        x = 50;
        if (x < 10) {
        } else if (x >= 10 && x < 20) {
            System.out.println(x + " Between 10 and 20");
        } else if(x >= 20) {
            System.out.println(x + " Greater than or equal to 20");
        }
    }

    /**
     * Write a program that declares 1 integer variable x, and then assigns 15 to it.
     * Write an if-else statement
     * that prints “Out of range” if the number is less than 10 or greater than 20 and
     * prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
     * Change x to 5 and notice the result.
     */
    public static void question4() {
        int x = 15;
        if (x < 10 || x > 20) {
            System.out.println(x + " Out of range");
        } else if (x >= 10 && x < 20) {
            System.out.println(x + " In range");
        }
        x = 5;
        if (x < 10 || x > 20) {
            System.out.println(x + " Out of range");
        } else if (x >= 10 && x < 20) {
            System.out.println(x + " In range");
        }
    }

    /**
     *  Write a program that uses if-else-if statements to print out grades A, B, C, D, F,
     *  according to the following criteria:
     * A: 90-100
     * B: 80-89
     * C: 70-79
     * D: 60-69
     * F: <60
     * Use the Scanner class to accept a number score from the user to determine the letter grade.
     * Print out “Score out of range” if the score is less than 0 or greater than 100.
     */
    public static void question5(int score) {
        if( score >= 90  && score <=  100){
            System.out.println(score + " Grade A");
        } else if(score >= 80  && score <=  89){
            System.out.println(score + " Grade B");
        } else if(score >= 70  && score <=  79){
            System.out.println(score + " Grade C");
        } else if(score >= 60  && score <=  69){
            System.out.println(score + " Grade D");
        } else if(score < 60 ){
            System.out.println(score + " Grade F");
        }
    }

    /**
     * Write a program that accepts an integer between 1 and 7 from the user.
     * Use a switch statement to print out the corresponding weekday.
     * Print “Out of range” if the number is less than 1 or greater than 7.
     * Do not forget to include “break” statements in each of your cases.
     * @param dayNumber
     */
    public static void question6(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }
    }

    /**
     * Create a program that lets the users input their filing status and income.
     * Display how much tax the user would have to pay according to status and income.
     * The U.S. federal personal income tax is calculated based on the filing status and taxable income.
     * There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
     * The tax rates for 2009 are shown below.
     * @param status
     * @param taxableIncome
     */
    public static double question7(String status , double taxableIncome) {
        double tax = 0;
        switch (status.toLowerCase()) {
            case "single" : // Single
                if (taxableIncome >= 0 && taxableIncome <= 8350) {
                   return tax = taxableIncome * 0.10;
                } else if (taxableIncome >= 8351 && taxableIncome <= 33950) {
                   return tax = taxableIncome * 0.15;
                } else if (taxableIncome >= 33951 &&  taxableIncome <= 82250) {
                   return tax = taxableIncome * 0.25;
                } else if (taxableIncome >= 82251 && taxableIncome <= 171550) {
                    return tax = taxableIncome * 0.28;
                } else if (taxableIncome >= 171551 && taxableIncome <= 372950) {
                    return tax = taxableIncome * 0.33;
                } else if(taxableIncome >= 372951) {
                    return tax = taxableIncome * 0.35;
                }
                break;
            case "married filing jointly": // Married Filing Jointly
            case "qualifying widow(er)":
                if (taxableIncome >= 0 && taxableIncome <= 16700) {
                    return tax = taxableIncome * 0.10;
                } else if (taxableIncome >= 16701 && taxableIncome <= 67900) {
                    return tax = taxableIncome * 0.15;
                } else if (taxableIncome >= 67901 &&  taxableIncome <= 137050) {
                    return tax = taxableIncome * 0.25;
                } else if (taxableIncome >= 137051 && taxableIncome <= 208850) {
                    return tax = taxableIncome * 0.28;
                } else if (taxableIncome >= 208851 && taxableIncome <= 372950) {
                    return tax = taxableIncome * 0.33;
                } else if(taxableIncome >= 372951) {
                    return tax = taxableIncome * 0.35;
                }
                break;
            case "married filing separately": // Married Filing Separately
                if (taxableIncome >= 0 && taxableIncome <= 8350) {
                    return tax = taxableIncome * 0.10;
                } else if (taxableIncome >= 8351 && taxableIncome <= 33950) {
                    return tax = taxableIncome * 0.15;
                } else if (taxableIncome >= 33951 &&  taxableIncome <= 68525) {
                    return tax = taxableIncome * 0.25;
                } else if (taxableIncome >= 68526 && taxableIncome <= 104425) {
                    return tax = taxableIncome * 0.28;
                } else if (taxableIncome >= 104426 && taxableIncome <= 186475) {
                    return tax = taxableIncome * 0.33;
                } else if(taxableIncome >= 186476) {
                    return tax = taxableIncome * 0.35;
                }
                break;
            case "head of household": // Head of Household
                if (taxableIncome >= 0 && taxableIncome <= 11950) {
                    return tax = taxableIncome * 0.10;
                } else if (taxableIncome >= 11951 && taxableIncome <= 45500) {
                    return tax = taxableIncome * 0.15;
                } else if (taxableIncome >= 45501 &&  taxableIncome <= 117450) {
                    return tax = taxableIncome * 0.25;
                } else if (taxableIncome >= 117451 && taxableIncome <= 190200) {
                    return tax = taxableIncome * 0.28;
                } else if (taxableIncome >= 190201 && taxableIncome <= 372950) {
                    return  tax = taxableIncome * 0.33;
                } else if(taxableIncome >= 372951) {
                    return  tax = taxableIncome * 0.35;
                }
                break;
            default:
                System.out.println("Invalid filing status. Please restart the program and try again.");
        }
        return tax;

    }


}