package com.mischief247.ffrpgmonstermaker.util;


public enum Classes {
    CLASS_I("Class I"),
    CLASS_II("Class II"),
    CLASS_III("Class III"),
    CLASS_IV("Class IV");
    private final String name;
    private Classes(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
