package com.kylelim.enums;

public enum ArticleStatusEnum {

    PUBLIC(0,"已发布"),
    UNPUBLIC(1, "草稿");

    int stauts;
    String stautsDesc;

    ArticleStatusEnum(int stauts, String stautsDesc){
        this.stauts = stauts;
        this.stautsDesc = stautsDesc;
    }

    public int getStauts() {
        return stauts;
    }

    public String getStautsDesc() {
        return stautsDesc;
    }

}
