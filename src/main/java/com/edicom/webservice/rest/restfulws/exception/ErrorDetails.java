package com.edicom.webservice.rest.restfulws.exception;

import java.time.LocalDateTime;

//Custom structure for Exception in a request
public class ErrorDetails {

    private LocalDateTime timeStamp;
    private String clientError;
    private String details;

    public ErrorDetails(LocalDateTime timeStamp, String clientError, String details) {
        this.timeStamp = timeStamp;
        this.clientError = clientError;
        this.details = details;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getClientError() {
        return clientError;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "ErrorDetails{" +
                "timeStamp=" + timeStamp +
                ", clientError='" + clientError + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
