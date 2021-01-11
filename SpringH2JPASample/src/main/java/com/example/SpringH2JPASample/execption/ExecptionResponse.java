package com.example.SpringH2JPASample.execption;

import java.util.Date;

public class ExecptionResponse {
    private Date timeStamp;
    private String message;
    private String details;

    public ExecptionResponse(Date timeStamp, String message, String details) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}

