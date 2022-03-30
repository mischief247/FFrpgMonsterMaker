package com.mischief247.ffrpgmonstermaker.data.abilities;

public enum DamageDie {
    D6(8,3,"d6"),
    D8(20,8,"d8"),
    D10(30,10,"d10"),
    D12(60,20,"d12");
    public final double XP_MOD;
    public final double GIL_MOD;
    private final String name;
    DamageDie(double xpMod,double gilMod,String name){
        XP_MOD= xpMod;
        GIL_MOD =  gilMod;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
