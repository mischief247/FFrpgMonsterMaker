package com.mischief247.ffrpgmonstermaker.data.monsters;

public enum MonsterCategory {
    ABNORMAL("Abnormal"),
    AERIAL("Aerial"),
    AMORPH("Amorph"),
    AQUAN("Aquan"),
    ARCANA("Arcana"),
    BEAST("Beast"),
    CONSTRUCTS("Construct"),
    DRAGON("Dragon"),
    FIEND("Fiend"),
    HUMANOID("Humanoid"),
    INSECT("Insect"),
    LIZARD("Lizard"),
    PLANT("Plant"),
    UNDEAD("Undead");
    private final String name;
    private MonsterCategory(String name){
    this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
