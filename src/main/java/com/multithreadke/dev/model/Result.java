package com.multithreadke.dev.model;

public class Result {
    private Boolean error;
    private String statusCode;
    private String statusMessage;

    public Result() {
    }

    public Result(Boolean error, String statusCode, String statusMessage) {
        this.error = error;
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return "Result{" +
                "error=" + error +
                ", statusCode='" + statusCode + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                '}';
    }
}
