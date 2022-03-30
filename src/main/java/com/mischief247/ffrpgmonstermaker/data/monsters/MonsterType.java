package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum MonsterType {
    REGULAR(40,15,1,1,"Regular"),
    NOTORIOUS(100,25,2,1.5,"Notorious"),
    BOSS(225,55,4,2,"Boss"),
    END_BOSS(350,90,6,3,"End Boss");
    public final double HP_Mod;
    public final double MP_MOD;
    public final double BASE_XP;
    public final double BASE_GIL;
    private final String name;
    MonsterType(double baseXp, double baseGil, double hpMod, double mpMod,String name){
    BASE_XP = baseXp;
    BASE_GIL = baseGil;
    HP_Mod = hpMod;
    MP_MOD = mpMod;
    this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
