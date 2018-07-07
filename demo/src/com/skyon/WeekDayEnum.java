package com.skyon;

public enum WeekDayEnum {
    SUN(0,"Sunday"),
    MON(1,"Monday"),
    TUS(2,"Tuesday"),
    WED(3,"Wednesday"),
    THU(4,"Thursday"),
    FRI(5,"Friday"),
    SAT(6,"Saturday");

    private int value;
    private String desc;

    WeekDayEnum(int value,String desc){
        this.value=value;
        this.desc=desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
