package com.company;

public class Converter {

    /* public Meter convert(Mile mile) {*/
    public Meter convertMilesToMeters(Mile mile) {
        Meter meter=new Meter();
        meter.setDist(mile.getDist() * 1609);
        return meter;
    }
    /* public Meter convert(Meter meter) {*/
    public Mile convertMetersToMiles(Meter meter){
        Mile mile=new Mile();
        mile.setDist(meter.getDist()/1609);
        return mile;
    }
}
