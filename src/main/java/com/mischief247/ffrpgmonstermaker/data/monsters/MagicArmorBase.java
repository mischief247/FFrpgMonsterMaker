package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum MagicArmorBase {
    GOBLIN(.5,-5,-2,"Goblin"),
    GHOST(1,0,0,"Ghost"),
    BLACK_MAGE(2,10,5,"Black Mage"),
    DARK_FORCE(4,19,9,"Dark Force"),
    MAGIC_MASTER(6,26,18,"Magic Master");

    public final double  BASE;
    public final double XP_MOD;
    public final double GIL_MOD;
    private final String name;
    MagicArmorBase(double base, double xpMod, double gilMod,String name){
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
