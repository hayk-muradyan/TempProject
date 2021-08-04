package com.company;

public class Main {

    public static void main(String[] args) {
        Mile mile = new Mile();
        mile.setDist(10);

        Converter converter = new Converter();

        Meter meter = converter.convertMilesToMeters(mile);
        System.out.println(mile.getDist()+" mile is "+meter.getDist()+" meter");

        Meter meter1 = new Meter();
        meter1.setDist(1609);

        Mile mile1 = converter.convertMetersToMiles(meter1);
        System.out.println(meter1.getDist()+" meter is "+mile1.getDist()+" mile");
    }
}
