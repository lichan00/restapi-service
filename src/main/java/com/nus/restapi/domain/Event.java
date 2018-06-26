package com.nus.restapi.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Contains the data of the event
 */
public class Event {

    //Need to explicitly map to let GSON know that event_time maps to
    //eventTime
    @SerializedName(value="event_time")
    private String eventTime;

    @SerializedName(value="timestamp")
    private String timeStamp;

    @SerializedName(value="regions")
    private Region region;

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return  "event_time:'" + eventTime + "'\n" +
                "timestamp:'" + timeStamp + "'\n" +
                region;
    }
}
