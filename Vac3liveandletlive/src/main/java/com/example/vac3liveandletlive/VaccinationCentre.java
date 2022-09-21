package com.example.vac3liveandletlive;

public class VaccinationCentre {
public String Centrename;
public String Address;
public String Postcode;
public int parkingspaces;

    public VaccinationCentre(String centrename, String address, String postcode, int parkingspaces) {
        Centrename = centrename;
        Address = address;
        Postcode = postcode;
        this.parkingspaces = parkingspaces;
    }

    public String getCentrename() {
        return Centrename;
    }

    public void setCentrename(String centrename) {
        Centrename = centrename;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public int getParkingspaces() {
        return parkingspaces;
    }

    public void setParkingspaces(int parkingspaces) {
        this.parkingspaces = parkingspaces;
    }

    @Override
    public String toString() {
        return "VaccinationCentre{" +
                "Centrename='" + Centrename + '\'' +
                ", Address='" + Address + '\'' +
                ", Postcode='" + Postcode + '\'' +
                ", parkingspaces=" + parkingspaces +
                '}';
    }
//public mylinkedistList<booth> Blist = new myLinkedList<>();

}
