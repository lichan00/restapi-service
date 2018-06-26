package com.nus.restapi.domain;

/**
 * Contains the data on the regions
 */
public class Region {

    private int north;
    private int south;
    private int west;
    private int central;
    private int east;

    public int getNorth() {
        return north;
    }

    public void setNorth(int north) {
        this.north = north;
    }

    public int getSouth() {
        return south;
    }

    public void setSouth(int south) {
        this.south = south;
    }

    public int getWest() {
        return west;
    }

    public void setWest(int west) {
        this.west = west;
    }

    public int getCentral() {
        return central;
    }

    public void setCentral(int central) {
        this.central = central;
    }

    public int getEast() {
        return east;
    }

    public void setEast(int east) {
        this.east = east;
    }

    //Defines how we want to display the object
    @Override
    public String toString() {
        return "north:" + north + "\n" +
                "south:" + south + "\n" +
                "west:" + west + "\n" +
                "central:" + central + "\n" +
                "east:" + east;
    }
}
