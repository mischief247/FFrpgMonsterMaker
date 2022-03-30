package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum DropTier {
    COMMON("Common"),
    UNCOMMON("Uncommon"),
    RARE("Rare"),
    VERY_RARE("Very Rare");
    private final String name;
    private DropTier(String name){
        this.name =  name;
    }

    @Override
    public String toString() {
        return name;
    }
}
