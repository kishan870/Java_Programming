
//This program takes daily temp input from user into an array and finds out average temperature, and number of days above average

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        int[] dailyTemperatures;
        double avg;
        int totalTemp = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many days?");
        int numDays = sc.nextInt();

        dailyTemperatures = new int[numDays];

        for(int i=0; i< numDays; i++) {
            System.out.println("Enter " + i + " day temperature: ");
            dailyTemperatures[i] = sc.nextInt();
            totalTemp += dailyTemperatures[i];
        }

        sc.close();

        avg = totalTemp / numDays;

        System.out.println("Average daily temperature: " + avg);

        int daysAboveAverage = 0;

        for(int i=0; i< numDays; i++) {
            if(dailyTemperatures[i] > avg) {
                daysAboveAverage++;
            }
        }

        System.out.println("Days above average temperature: " + daysAboveAverage);

    }
}
