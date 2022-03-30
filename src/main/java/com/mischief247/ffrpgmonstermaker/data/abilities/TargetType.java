package com.mischief247.ffrpgmonstermaker.data.abilities;

public enum TargetType {
    NO_DAMAGE(1,1,"No Damage"),
    SINGLE(1,1,"Single"),
    RANDOM_TARGET(.75,.75,"Random Target"),
    UNFOCUSED_VULN(1,1,"Unfocused(can hit self)"),
    UNFOCUSED_INVULN(2,2,"Unfocused(can't hit self)");
    public final double XP_MOD;
    public final double GIL_MOD;
    private final String name;
    TargetType(double xpMod, double gilMod, String name){
        XP_MOD = xpMod;
        GIL_MOD= gilMod;
        this.name =  name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
