package com.citi.lecture.enums;

import com.citi.lecture.constants.CommonConstants;

public enum ClientEnum {
    Blackstone("BlackStone"),
    Morgan("Morgan Stanley");

    private String value;

    ClientEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public ClientEnum getClientEnum (String value) {
        for (ClientEnum clientEnum : ClientEnum.values()){
            if (clientEnum.getValue().equals(value)) {
                return clientEnum;
            }
        }
        return null;
    }

    public String getClientEnums () {
        StringBuilder builder = new StringBuilder();

        for (ClientEnum clientEnum : ClientEnum.values()) {
            builder.append(clientEnum.value);
            builder.append(CommonConstants.COMMA);
        }

        return builder.substring(0, builder.length()-1);
    }
}
