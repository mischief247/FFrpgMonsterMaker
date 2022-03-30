package com.mischief247.ffrpgmonstermaker.data.abilities;

public enum SimpleAbilities {
    SPELL_LEVEL_1(8,5,"Level 1 Spell"),
    SPELL_LEVEL_2(15,9,"Level 2 Spell"),
    SPELL_LEVEL_3(25,14,"Level 3 Spell"),
    SPELL_LEVEL_4(33,21,"Level 4 Spell"),
    SPELL_LEVEL_5(45,30,"Level 5 Spell"),
    SPELL_LEVEL_6(55,37,"Level 6 Spell"),
    SPELL_LEVEL_7(64,44,"Level 7 Spell"),
    SPELL_LEVEL_8(80,55,"Level 8 Spell"),
    BLUE_SPELL_1_9(8,5,"Blue Spell 1-9 Mp"),
    BLUE_SPELL_10_18(15,9,"Blue Spell 10-18 Mp"),
    BLUE_SPELL_19_27(25,14,"Blue Spell 19-27 Mp"),
    BLUE_SPELL_28_40(33,21,"Blue Spell 28-40 Mp"),
    BLUE_SPELL_41_54(45,30,"Blue Spell 41-54 Mp"),
    BLUE_SPELL_55_67(55,37,"Blue Spell 55-67 mp"),
    BLUE_SPELL_68_84(64,44,"Blue Spell 68-84 Mp"),
    BLUE_SPELL_85(80,55,"Blue Spell 85+ Mp"),
    CALL_1_25(27,14,"Call 1-25 Mp"),
    CALL_26_60(42,29,"Call 26-60 Mp"),
    CALL_61_100(64,44,"Call 61-100 mp"),
    CALL_101(88,59,"Call 101+ Mp"),
    LEVEL_1_5(10,3,"Ability level 1-5"),
    LEVEL_6_12(18,7,"Ability level 6-12"),
    LEVEL_13_19(26,9,"Ability level 13-19"),
    LEVEL_20_26(32,12,"Ability level 20-26"),
    LEVEL_27_33(44,16,"Ability level 27-33"),
    LEVEL_34_40(53,19,"Ability level 34-40"),
    LEVEL_41_47(61,22,"Ability level 41 - 47"),
    LEVEL_48_54(70,25,"Ability level 48-54"),
    LEVEL_55_61(78,28,"Ability level 55-61"),
    LEVEL_62(86,31,"Ability level 62+");
    public final int xpMod;
    public final int gilMod;
    private final String name;
    SimpleAbilities(int xpMod, int gil_mod,String name){
        this.xpMod =xpMod;
        this.gilMod= gil_mod;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
