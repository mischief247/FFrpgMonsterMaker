package com.mischief247.ffrpgmonstermaker.data;

public enum Elements {
    FIRE("Fire"),
    ICE("Ice"),
    LIGHTNING("Lightning"),
    WATER("Water"),
    WIND("Wind"),
    EARTH("Earth"),
    HOLY("Holy"),
    SHADOW("Shadow"),
    BIO("Bio"),
    NONE("none");
    private final String name;
    private Elements(String name){this.name = name;}

    @Override
    public String toString() {
        return name;
    }
}
