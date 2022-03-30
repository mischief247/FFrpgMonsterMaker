package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum FieldEffects {
    ATTACK_LOCK(22,7,"Attack Lock"),
    HP_SAP(48,16,"Hp Sap"),
    ITEM_LOCK(33,11,"Item Lock"),
    MAGIC_LOCK(48,16,"Magic Lock"),
    MAGNETIC_FIELD(48,16,"Magnetic Field"),
    MP_SAP(48,16,"Mp Sap"),
    SPELL_LOCK(33,11,"Spell Lock"),
    TECHNIQUE_LOCK(48,16,"Technique Lock")
    ;

    public final double XP_MOD;
    public final double GIL_MOD;
    public final String name;
    FieldEffects(double xpMod,double gilMod, String name){
        XP_MOD = xpMod;
        GIL_MOD= gilMod;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
