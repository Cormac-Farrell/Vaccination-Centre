package com.example.vac3liveandletlive;

public class Booth {
    private String BoothID;
    private String Floorlvl;
    private String Accessablility;
    private String Worker;

    public Booth(String boothID, String floorlvl, String accessablility, String worker) {
        BoothID = boothID;
        Floorlvl = floorlvl;
        Accessablility = accessablility;
        Worker = worker;
    }

    public String getBoothID() {
        return BoothID;
    }

    public void setBoothID(String boothID) {
        BoothID = boothID;
    }

    public String getFloorlvl() {
        return Floorlvl;
    }

    public void setFloorlvl(String floorlvl) {
        Floorlvl = floorlvl;
    }

    public String getAccessablility() {
        return Accessablility;
    }

    public void setAccessablility(String accessablility) {
        Accessablility = accessablility;
    }

    public String getWorker() {
        return Worker;
    }

    public void setWorker(String worker) {
        Worker = worker;
    }
}
