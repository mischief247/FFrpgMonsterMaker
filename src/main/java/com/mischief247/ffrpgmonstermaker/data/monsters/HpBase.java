package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum HpBase {
    LEAF_BUNNY(1,-16,-6,"Leaf Bunny"),
    GOBLIN(1.5,-8,-3,"Goblin"),
    SERGEANT(2,0,0,"Sergeant"),
    OCHU(4,18,8,"Ochu"),
    BEHEMOTH(6,40,19,"Behemoth"),
    TONBERRY(8,60,30,"Tonberry");
    public final double HIT_BASE;
    public final double XP_MOD;
    public final double GIL_MOD;
    private final String name;
    HpBase(double hitBase, double xpMod, double gilMod, String name){
        HIT_BASE =  hitBase;
        XP_MOD=xpMod;
        GIL_MOD = gilMod;
        this.name = name;
    }

    @Override
    public String toString() {
        return name+"("+HIT_BASE+")";
    }
}
