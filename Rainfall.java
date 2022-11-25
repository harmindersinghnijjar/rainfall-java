/*

  Programmer: Harminder Singh Nijjar

  Assignment Chapter: Chapter 7

  Purpose: The purpose of the code is to calculate the total rainfall for each month,
  the average monthly rainfall, the month with the most rain, and the month with the least rain.

  Date modified: 11/24/2022

  IDE/Toool used: IntelliJ IDEA

  */
public class Rainfall {

    public static void main(String[] args) {

        double[] rainfall = new double[12];

        rainfall[0] = 2.7;
        rainfall[1] = 1.2;
        rainfall[2] = 1.5;
        rainfall[3] = 3.7;
        rainfall[4] = 2.9;
        rainfall[5] = 1.8;
        rainfall[6] = 2.1;
        rainfall[7] = 2.3;
        rainfall[8] = 3.4;
        rainfall[9] = 2.8;
        rainfall[10] = 1.9;
        rainfall[11] = 2.6;

        double totalRainfall = 0.0;
        double averageRainfall = 0.0;
        double mostRainfall = 0.0;
        double leastRainfall = 0.0;
        String monthWithMostRainfall = "";
        String monthWithLeastRainfall = "";

        for(int i = 0; i < rainfall.length; i++) {
            totalRainfall += rainfall[i];
        }

        averageRainfall = totalRainfall / rainfall.length;

        for(int i = 0; i < rainfall.length; i++) {
            if(rainfall[i] > mostRainfall) {
                mostRainfall = rainfall[i];
                monthWithMostRainfall = getMonth(i);
            }
        }

        leastRainfall = rainfall[0];
        for(int i = 0; i < rainfall.length; i++) {
            if(rainfall[i] < leastRainfall) {
                leastRainfall = rainfall[i];
                monthWithLeastRainfall = getMonth(i);
            }
        }

        System.out.println("Total rainfall: " + totalRainfall);
        System.out.println("Average rainfall: " + averageRainfall);
        System.out.println("Most rainfall: " + mostRainfall + " in " + monthWithMostRainfall);
        System.out.println("Least rainfall: " + leastRainfall + " in " + monthWithLeastRainfall);
    }

    public static String getMonth(int month) {
        switch(month) {
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                return "Invalid month";
        }
    }
}
