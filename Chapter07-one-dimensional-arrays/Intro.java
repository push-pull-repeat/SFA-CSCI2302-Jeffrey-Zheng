/*
 * Write a program that prompts the user to enter the grades for 5 students
 * then:
 * 1. Calculates and prints the average grade
 * 2. Calculates and prints the number of grades that is above the average
 */

public class Intro
{
    public static void main(String[] args)
    {
        double grade1 = 95;
        double grade2 = 80;
        double grade3 = 98;
        double grade4 = 84;
        double grade5 = 88;
        double grade6 = 87;

        double average = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6)/6;
        int count = 0;
        if (grade1 > average)
        {
            count++;
        }
        if (grade2 > average)
        {
            count++;
        }
        if (grade3 > average)
        {
            count++;
        }
        if (grade4 > average)
        {
            count++;
        }
        if (grade5 > average)
        {
            count++;
        }
        System.out.printf(("The average grade is %5.2f\n"), average);

        System.out.printf("the number of grades that are above the average is: %d\n", count);
    }
}
