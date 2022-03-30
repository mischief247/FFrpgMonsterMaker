package com.mischief247.ffrpgmonstermaker.data.abilities;

import com.mischief247.ffrpgmonstermaker.data.Elements;
import com.mischief247.ffrpgmonstermaker.data.Status;

import java.util.ArrayList;
import java.util.Objects;

public class Attack {
    private double xpMod=0;
    private double gilMod =0;
    private String name;
    private DamageDie damageDie = DamageDie.D6;
    private TargetType targetClass = TargetType.NO_DAMAGE;
    private final ArrayList<Modifier> Modifiers =  new ArrayList<>();

    public double getXpMod() {
        return xpMod;
    }

    public double getGilMod() {
        return gilMod;
    }

    public String getName() {
        return name;
    }

    public DamageDie getDamageDie() {
        return damageDie;
    }

    public TargetType getTargetClass() {
        return targetClass;
    }

    public ArrayList<Modifier> getModifiers() {
        return Modifiers;
    }

    public void setName(String name) {
        this.name = name;
        update();
    }

    public void setDamageDie(DamageDie damageDie) {
        this.damageDie = damageDie;
        update();
    }

    public void setTargetClass(TargetType targetClass) {
        this.targetClass = targetClass;
        update();
    }
    public void  addModifier(Modifier modifier){
        if (!Modifiers.contains(modifier)) {
            Modifiers.add(modifier);
            update();
        }
    }
    public void removeModifier(Modifier modifier){
        Modifiers.remove(modifier);
        update();
    }
    private void  update(){
         xpMod = 0;
         gilMod = 0;
         xpMod += damageDie.XP_MOD;
         gilMod += damageDie.GIL_MOD;
         double xpMul = 1;
         double gilMul = 1;
         xpMul = xpMul * targetClass.XP_MOD;
         gilMul =  gilMul * targetClass.GIL_MOD;
         for (Modifier modifier: Modifiers
             ) {
            if(!modifier.isMultiplicative()) {
                xpMod += modifier.getXpMod();
                gilMod += modifier.getGilMod();
            }
            else{
                xpMul = xpMul * modifier.getXpMod();
                gilMul = gilMul * modifier.getGilMod();
            }
         }
         xpMod =  xpMod * xpMul;
         gilMod = gilMod* gilMul;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attack attack = (Attack) o;
        return Double.compare(attack.xpMod, xpMod) == 0 &&
                Double.compare(attack.gilMod, gilMod) == 0 &&
                name.equals(attack.name) &&
                damageDie == attack.damageDie &&
                targetClass == attack.targetClass &&
                Objects.equals(Modifiers, attack.Modifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xpMod, gilMod, name, damageDie, targetClass, Modifiers);
    }
}
