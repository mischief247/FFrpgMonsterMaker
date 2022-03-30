package com.mischief247.ffrpgmonstermaker.data;

import com.mischief247.ffrpgmonstermaker.util.Classes;

import java.util.ArrayList;

public enum Status{
    BERSERK(Classes.CLASS_I,"berserk"),
    BLIND(Classes.CLASS_I,"Blind"),
    CURSE(Classes.CLASS_I,"Curse"),
    DISABLE(Classes.CLASS_I,"Disable"),
    IMMOBILIZE(Classes.CLASS_I,"Immobilize"),
    POISON(Classes.CLASS_I,"Poison"),
    SILENCE(Classes.CLASS_I,"Silence"),
    SLEEP(Classes.CLASS_I,"Sleep"),
    SLOW(Classes.CLASS_I,"Slow"),
    CONDEMNED(Classes.CLASS_II,"Condemned"),
    CONFUSE(Classes.CLASS_II,"Confuse"),
    PETRIFY(Classes.CLASS_II,"Petrify"),
    X_DOWN(Classes.CLASS_II,"X-Down"),
    SAO(Classes.CLASS_II,"Sad"),
    UNAWARE(Classes.CLASS_II,"Unaware"),
    EJECT(Classes.CLASS_III,"Eject"),
    MINI(Classes.CLASS_III,"Mini"),
    TOAD(Classes.CLASS_III,"Toad"),
    X_BREAK(Classes.CLASS_III,"X-Break"),
    STOP(Classes.CLASS_III,"Stop"),
    VENOM(Classes.CLASS_III,"Venom"),
    ZOMBIE(Classes.CLASS_III,"Zombie"),
    CHARM(Classes.CLASS_IV,"Charm"),
    DEATH(Classes.CLASS_IV,"Death"),
    FROZEN(Classes.CLASS_IV,"Frozen"),
    HEAT(Classes.CLASS_IV,"Heat"),
    MELTDOWN(Classes.CLASS_IV,"Meltdown"),
    STONE(Classes.CLASS_IV,"Stone"),
    FLOAT(Classes.CLASS_I,"Float",true),
    AGILITY_UP(Classes.CLASS_I,"Agility Up",true),
    SPIRIT_UP(Classes.CLASS_I,"Spirit Up",true),
    ELEMENT_SPIKES(Classes.CLASS_I,"Element Spikes",true),
    PROTECT(Classes.CLASS_II,"Protect",true),
    SHELL(Classes.CLASS_II,"Shell",true),
    ARMOUR_UP(Classes.CLASS_II,"Armour Up",true),
    MENTAL_UP(Classes.CLASS_II,"Mental Up",true),
    HASTE(Classes.CLASS_III,"Haste",true),
    REFLECT(Classes.CLASS_III,"Reflect",true),
    POWER_UP(Classes.CLASS_III,"Power UP",true),
    MAGIC_UP(Classes.CLASS_III,"Magic up",true),
    REGEN(Classes.CLASS_IV,"Regen",true),
    AURA(Classes.CLASS_IV,"Aura",true),
    VANISH(Classes.CLASS_IV,"Vanish",true),
    NONE(null,"none",false);
    public final Classes CLASS;
    private final String name;
    public final boolean IS_POSITIVE;
    Status(Classes classes, String name){
        CLASS = classes;
        this.name = name;
        IS_POSITIVE = false;
    }
    Status(Classes classes,String name,boolean isPositive){
        CLASS =  classes;
        this.name =name;
        IS_POSITIVE = isPositive;
    }

    /**
     * @param classes the class of status effect being requested
     * @param isPositive weather the status effects or positive or negative
     * @return an array list containing all statuses that match the type and class of status requested;
     */
    public static ArrayList<Status> getAllStatusesOfClass(Classes classes, boolean isPositive){
        ArrayList<Status> output =  new ArrayList<>();
        for (Status status: Status.values()) {
            if(status.CLASS == classes && status.IS_POSITIVE == isPositive){
                output.add(status);
            }
        }
        return output;
    }

    @Override
    public String toString() {
        return name;
    }
}
