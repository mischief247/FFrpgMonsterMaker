package com.mischief247.ffrpgmonstermaker.data.abilities;

public enum AttackModifier {
    AUTO_HIT(2,2,"Auto hit",true),
    CHARGE_BREAKER(18,18,"Charge Breaker"),
    COUNTDOWN(.8,.8,"Countdown",true),
    DELTA_ATTACK_SINGLE(.75,.75,"Delta Attack: Single Component",true),
    DELTA_ATTACK_MULTIPLE(.5,.5,"Delta Attack: Multiple Components",true),
    DELAY_ATTACK_25(5,2,"Delay Attack 25%"),
    DELAY_ATTACK_50(10, 3,"Delay Attack 50%"),
    DELAY_ATTACK_75(20,6,"Delay Attack 75"),
    DELAY_STRIKE_25(6,2,"Delay Strike 25%"),
    DELAY_STRIKE_50(11,3,"Delay Strike 50%"),
    DELAY_STRIKE_75(21,6,"Delay Strike 75%"),
    DELAY_TOUCH_25(3,2,"Delay Touch 25%"),
    DELAY_TOUCH_50(8,2,"Delay Touch 50%"),
    DELAY_TOUCH_78(16,5,"Delay Touch 75%"),
    DISPEL_ATTACK(48,16,"Dispel Attack"),
    DISPEL_STRIKE(51,18,"Dispel Strike"),
    DISPEL_TOUCH(25,8,"Dispel touch"),
    ELEMENTAL_AFFINITY(1,1,"Elemental Affinity",true),
    GROUND_BASED(.8,.8,"Ground Based",true),
    HP_DRAIN(1.25,1.25,"HP Drain",true),
    HP_SIPHON(1.5,1.5,"Hp Siphon",true),
    MELTING(1.75,1.75,"Melting",true),
    MP_COST(.75,.75,"Mp_Cost",true),
    MP_DRAIN(1.25,1.25,"Mp Drain",true),
    MP_SIPHON(1.75,1.6,"Mp Siphon",true),
    NEAR_FATAL_ATTACK(46,22,"Near Fatal Attack"),
    NEAR_FATAL_STRIKE(49,24,"Near Fatal Strike"),
    NEAR_FATAL_TOUCH(24,11,"near Fatal Touch"),
    PIERCING(1.25,1.25,"Piercing",true),
    POWER_STRIKE(2,2,"Power Strike",true),
    RANGED(1.1,1.1,"Ranged",true),
    SLOW(.75,.7,"Slow",true),
    SOS_GAIN(.75,.75,"SOS Gain",true),
    SOS_LOSE(.75,.75,"SOS Lose",true),
    SPLIT_DAMAGE(1.25,1.25,"Split Damage",true),
    UNSEALABLE(3,3,"Unsealable",true),
    STATUS_ATTACK(0,0,"Status Attack");
    public final double XP_MOD;
    public final double GIL_MOD;
    public final boolean IS_MULTIPLICATIVE;
    private final String name;
    public final boolean hasElement;
    public final boolean hasStatus;
    AttackModifier(double xpMod, double gilMod,String name){
        XP_MOD = xpMod;
        GIL_MOD = gilMod;
        IS_MULTIPLICATIVE = false;
        this.name = name;
        hasElement = false;
        hasStatus = false;
    }
    AttackModifier(double xpMod,double gilMod,String name,boolean isMultiplicative){
        XP_MOD = xpMod;
        GIL_MOD= gilMod;
        IS_MULTIPLICATIVE = isMultiplicative;
        this.name = name;
        hasElement = false;
        hasStatus = false;
    }

    @Override
    public String toString() {
        return name;
    }
}
