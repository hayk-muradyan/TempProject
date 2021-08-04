package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value of mile which you want to convert ");
        int mileValue = sc.nextInt();
        Mile mile = new Mile();

        mile.setDist(mileValue);

        System.out.println("Barev erjankutyun es qez spasum ei");

        Converter converter = new Converter();

        Meter meter = converter.convertMilesToMeters(mile);
        System.out.println(mile.getDist()+" mile is "+meter.getDist()+" meter");

        Meter meter1 = new Meter();
        System.out.println("Input value of meter which you want to convert ");
        int meterValue = sc.nextInt();
        meter1.setDist(meterValue);

        Mile mile1 = converter.convertMetersToMiles(meter1);
        System.out.println(meter1.getDist()+" meter is "+mile1.getDist()+" mile");
    }
}
