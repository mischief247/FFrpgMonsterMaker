package com.mischief247.ffrpgmonstermaker.data.abilities;
import com.mischief247.ffrpgmonstermaker.data.Elements;
import com.mischief247.ffrpgmonstermaker.data.Status;

import java.util.Objects;

public class Modifier {
    private final AttackModifier attackModifier;
    private final Elements element;
    private final Status status;
    private StatusAttacks statusAttacks;
public Modifier(AttackModifier attackModifier){
    this.attackModifier =attackModifier;
    this.element = Elements.NONE;
    this.status = Status.NONE;
    this.statusAttacks = StatusAttacks.NONE;
}
public Modifier(Elements element){
    this.attackModifier = AttackModifier.ELEMENTAL_AFFINITY;
    this.element = element;
    this.status = Status.NONE;
    this.statusAttacks = StatusAttacks.NONE;
}
public Modifier(StatusAttacks statusAttacks,Status status){
    this.statusAttacks = statusAttacks;
    this.element = Elements.NONE;
    this.status = status;
    this.attackModifier = AttackModifier.STATUS_ATTACK;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modifier modifier = (Modifier) o;
        return attackModifier == modifier.attackModifier &&
                element == modifier.element &&
                status == modifier.status &&  statusAttacks == modifier.statusAttacks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackModifier, element, status);
    }
    public double getXpMod(){
    return attackModifier.XP_MOD +statusAttacks.XP_MOD;
    }
    public double getGilMod(){
    return attackModifier.GIL_MOD+statusAttacks.GIL_MOD;
    }
    public Boolean isMultiplicative(){
    return attackModifier.IS_MULTIPLICATIVE;
    }
    @Override
    public String toString() {
        if (status != Status.NONE){
            return statusAttacks.toString()+" ("+status.toString()+")";
        }
        else if (element != Elements.NONE){
            return attackModifier.toString()+" ("+element.toString()+")";
        }
        else
            return attackModifier.toString();
    }
    }
