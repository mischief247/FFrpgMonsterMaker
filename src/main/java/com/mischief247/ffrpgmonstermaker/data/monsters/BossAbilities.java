package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum BossAbilities {
    DECOY(20,25),
    IMMUNITY_ALL(80,30),
    SLAVE_PART_NORMAL(-30,-10),
    SLAVE_PART_SUMMONED(-10,5),
    SLAVE_PART_AUTO_REVIVING(0,0),
    X_ACTION(80,30);




    public final double XP_MOD;
    public final double GIL_MOD;
    BossAbilities(double xpMod,double gilMod){
        XP_MOD = xpMod;
        GIL_MOD= gilMod;
    }
}
