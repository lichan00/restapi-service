package com.nus.restapi.domain;

import java.util.List;

/**
 * Domain class that contains the data retrieved from data.gov.sg rest api
 */
public class DataGov {
    private boolean status;
    private String start;
    private String end;
    private long count;
    private List<Event> data;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public boolean isStatus() {
        return status;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<Event> getData() {
        return data;
    }

    public void setData(List<Event> data) {
        this.data = data;
    }
}
