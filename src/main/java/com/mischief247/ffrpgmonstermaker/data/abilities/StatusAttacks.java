package com.mischief247.ffrpgmonstermaker.data.abilities;

import com.mischief247.ffrpgmonstermaker.util.Classes;

public enum StatusAttacks {
    STATUS_ATTACK_CLASS_1(18,6,"Class I Status Attack",StatusAttackClasses.ATTACK,Classes.CLASS_I),
    STATUS_ATTACK_CLASS_2(33,11,"Class II Status Attack",StatusAttackClasses.ATTACK,Classes.CLASS_II),
    STATUS_ATTACK_CLASS_3(48,16,"Class III Status Attack",StatusAttackClasses.ATTACK,Classes.CLASS_III),
    STATUS_ATTACK_CLASS_4(64,21,"Class IV Status Attack",StatusAttackClasses.ATTACK,Classes.CLASS_IV),
    STATUS_STRIKE_CLASS_1(18,6,"Class I Status Strike",StatusAttackClasses.STRIKE,Classes.CLASS_I),
    STATUS_STRIKE_CLASS_2(33,11,"Class II Status Strike",StatusAttackClasses.STRIKE,Classes.CLASS_II),
    STATUS_STRIKE_CLASS_3(48,16,"Class III Status Strike",StatusAttackClasses.STRIKE,Classes.CLASS_III),
    STATUS_STRIKE_CLASS_4(64,21,"Class IV Status Strike",StatusAttackClasses.STRIKE,Classes.CLASS_IV),
    STATUS_TOUCH_CLASS_1(18,6,"Class I Status Touch",StatusAttackClasses.TOUCH,Classes.CLASS_I),
    STATUS_TOUCH_CLASS_2(33,11,"Class II Status Touch",StatusAttackClasses.TOUCH,Classes.CLASS_II),
    STATUS_TOUCH_CLASS_3(48,16,"Class III Status Touch",StatusAttackClasses.TOUCH,Classes.CLASS_III),
    STATUS_TOUCH_CLASS_4(64,21,"Class IV Status Touch",StatusAttackClasses.TOUCH,Classes.CLASS_IV),
    NONE(0,0,"None",null,null);
    public final double XP_MOD;
    public final double GIL_MOD;
    private final String name;
    private final StatusAttackClasses statusAttackClasses;
    private final Classes classes;
    private StatusAttacks(double xpMod, double gilMod, String name, StatusAttackClasses statusAttackClasses, Classes classes){
        XP_MOD = xpMod;
        GIL_MOD = gilMod;
        this.name = name;
        this.statusAttackClasses = statusAttackClasses;
        this.classes = classes;
    }
    public static StatusAttacks lookupAttack(Classes classes, StatusAttackClasses statusAttackClasses){
        for (StatusAttacks attack: StatusAttacks.values()) {
            if (attack.classes == classes && attack.statusAttackClasses == statusAttackClasses)
                return attack;
        }
        return null; //this should be unreachable
    }
    @Override
    public String toString() {
        return name;
    }
}
