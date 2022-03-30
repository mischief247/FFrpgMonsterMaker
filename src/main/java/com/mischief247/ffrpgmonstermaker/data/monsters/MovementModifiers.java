package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum MovementModifiers {
    MOVE_BURROW(60,20,"Burrowing"),
    MOVE_FLIGHT(20,9,"Flying"),
    MOVE_GROUND(19,9,"Ground Based"),
    MOVE_TELEPORT(60,40,"Teleporting"),
    MOVE_WATER(0,0,"Swimming");
    public final double XP_MOD;
    public final double GIL_MOD;
    private final String name;
    MovementModifiers(int xpMod,int GilMod,String name){
        XP_MOD =xpMod;
        GIL_MOD=GilMod;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
