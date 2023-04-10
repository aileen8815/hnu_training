package com.citi.lecture.enums;

public enum TradeStatus {

    INTERNAL_SERVER_ERROR("Internal Server Error", 500),
    INVALID_CLIENT_NAME("Invalid Client Name", 500);

    String message;

    Integer statusCode;

    TradeStatus(String message, Integer statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return message;
    }

    public String getMessage() {
        return message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }
}
