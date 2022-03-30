package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum MpBase {
    LEAF_BUNNY(0,0,0,"Leaf Bunny"),
    GOBLIN(.5,8,3,"Goblin"),
    BLACK_MAGE(1,15,7,"Black Mage"),
    DARK_FORCE(1.5,22,10,"Dark Force"),
    BLACK_WALTZ(2,35,50,"Black Waltz"),
    MAGIC_MASTER(4,50,28,"Magic Master");
    public final double MP_BASE;
    public final double XP_MOD;
    public final double GIL_MOD;
    private final String name;
    MpBase(double base, double xpMod, double gilMod, String name){
        MP_BASE = base;
        XP_MOD =xpMod;
        GIL_MOD = gilMod;
        this.name = name;
    }

    @Override
    public String toString() {
         return name+"("+MP_BASE+")";
    }

}
