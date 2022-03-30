package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum IntelligenceClass {
    NONE("None"),
    ANIMAL("Animal"),
    PRIMITIVE("Primitive"),
    AVERAGE("Average"),
    HIGH("High"),
    ELDER("Elder");
    private final String name;
    private IntelligenceClass(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
