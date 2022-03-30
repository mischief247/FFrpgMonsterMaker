package com.mischief247.ffrpgmonstermaker.data.abilities;

public enum AbilityModifier {

    ADD_STATUS_CLASS_1(14,4,"Add Class I Status"),
    ADD_STATUS_CLASS_2(18,6,"Add Class II Status"),
    ADD_STATUS_CLASS_3(26,9, " Add Class III Status"),
    ADD_STATUS_CLASS_4(38,12,"Add Class IV Status"),
    ALARM(32,18,"Alarm"),
    CANNIBALIZE_HEAL(36,12,"Cannibalize: heal"),
    CANNIBALIZE__ADD_STATUS_CLASS_1(10,3,"Cannibalize: Add Class I Status"),
    CANNIBALIZE__ADD_STATUS_CLASS_2(15,5,"Cannibalize: Add Class II Status"),
    CANNIBALIZE__ADD_STATUS_CLASS_3(22,8,"Cannibalize: Add Class III Status"),
    CANNIBALIZE__ADD_STATUS_CLASS_4(32,11,"Cannibalize: Add Class IV Status"),
    CLONE(64,32,"Clone"),
    ESCAPE(5,2, "Escape"),
    IMPRISON(0,0,"Imprison"),//todo this needs to be its own thing
    ITEM_USE(15,0,"Item Usage"),
    RESTORE_25(20,13,"Restore 25%"),
    RESTORE_50(60,40,"restore 50%"),
    RESTORE_75(100,75,"Restore 75%"),
    STEAL_STATUS_POS_ONLY(+12,4,"Steal Status: positive only"),
    STEAL_STATUS_ALL(9,3,"Steal Status: all");



    public final double XP_MOD;
    public final double GIL_MOD;
    private final String name;
    AbilityModifier(int xpMod, int gilMod, String name){
        XP_MOD = xpMod;
        GIL_MOD = gilMod;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
