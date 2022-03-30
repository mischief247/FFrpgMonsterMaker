package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum ArmorBase {
    LEAFER(.5,-5,-2,"Leafer"),
    GOBLIN(1,0,0,"Goblin"),
    DARK_KNIGHT(2,10,5,"Dark Knight"),
    GOLEM(4,19,9,"Golem"),
    IRON_GIANT(6,26,18,"Iron Giant");

    public final double  BASE;
    public final double XP_MOD;
    public final double GIL_MOD;
    private final String name;
    ArmorBase(double base, double xpMod, double gilMod,String name){
        BASE = base;
        XP_MOD =xpMod;
        GIL_MOD= gilMod;
        this.name = name;
    }

    @Override
    public String toString() {
        return name+"("+BASE+")";
    }
}
