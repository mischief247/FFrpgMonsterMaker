package com.mischief247.ffrpgmonstermaker.data.abilities;

public enum StatusAttackClasses {
    ATTACK("Attack"),
    STRIKE("Strike"),
    TOUCH("Touch"),

    ;
    private final String name;
    StatusAttackClasses(String name){
        this.name = name;}
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
