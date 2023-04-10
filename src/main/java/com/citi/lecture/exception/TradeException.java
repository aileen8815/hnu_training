package com.citi.lecture.exception;

import com.citi.lecture.enums.TradeStatus;

public class TradeException extends Exception {

    private Integer code;

    private String message;

    public TradeException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public TradeException(TradeStatus tradeStatus) {
        this.code = tradeStatus.getStatusCode();
        this.message = tradeStatus.getMessage();
    }

    public TradeException(Throwable throwable) {
        super(throwable);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
