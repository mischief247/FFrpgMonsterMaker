package com.mischief247.ffrpgmonstermaker.data;

import com.mischief247.ffrpgmonstermaker.data.abilities.Attack;
import com.mischief247.ffrpgmonstermaker.data.abilities.SimpleAbilities;
import com.mischief247.ffrpgmonstermaker.data.monsters.*;

import java.util.ArrayList;

public class Monster {
    MonsterCategory monsterCategory;
    MonsterType monsterType;
    IntelligenceClass intelligenceClass;
    HpBase hpBase;
    MpBase mpBase;
    ArmorBase armorClass;
    MagicArmorBase magicArmorBase;
    ArrayList<Attack> attacks =  new ArrayList<>();
    ArrayList<SimpleAbilities> simpleAbilities= new ArrayList<>();
    ArrayList<MovementModifiers> movementModifiers =  new ArrayList<>();
    ArrayList<SupportAbilities> supportAbilities =  new ArrayList<>();
    ArrayList<FieldEffects> fieldEffects = new ArrayList<>();
    ArrayList<BossAbilities> bossAbilities =  new ArrayList<>();
    String name;
    double xpReward;
    double gilReward;
    double hp;
    double mp;
    double level;
    double accuracy;
    double magicAccuracy;
    double dex;
    double mind;
    double evasion;
    double magicEvasion;
    double str;
    double vit;
    double agi;
    double spd;
    double mag;
    double spr;
    double armor;
    double mArmor;

    public Monster(){
    hpBase = HpBase.LEAF_BUNNY;
    mpBase = MpBase.LEAF_BUNNY;
    armorClass = ArmorBase.LEAFER;
    magicArmorBase = MagicArmorBase.GOBLIN;
    monsterType = MonsterType.REGULAR;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setMonsterCategory(MonsterCategory monsterCategory) {
        this.monsterCategory = monsterCategory;
        update();
    }

    public void setMonsterType(MonsterType monsterType) {
        this.monsterType = monsterType;
        update();
    }

    public void setIntelligenceClass(IntelligenceClass intelligenceClass) {
        this.intelligenceClass = intelligenceClass;
        update();

    }

    public void setHpBase(HpBase hpBase) {
        this.hpBase = hpBase;
        update();
    }

    public void setMpBase(MpBase mpBase) {
        this.mpBase = mpBase;
        update();
    }

    public void setArmorClass(ArmorBase armorBase) {
        this.armorClass = armorBase;
        update();

    }

    public void setMagicArmorBase(MagicArmorBase magicArmorBase) {
        this.magicArmorBase = magicArmorBase;
        update();
    }
    public void setLevel(double level) {
        this.level = level;
        update();

    }
    public void setStr(double str) {
        this.str = str;
        update();
    }

    public void setVit(double vit) {
        this.vit = vit;
        update();
    }

    public void setAgi(double agi) {
        this.agi = agi;
        update();
    }

    public void setSpd(double spd) {
        this.spd = spd;
        update();
    }

    public void setMag(double mag) {
        this.mag = mag;
        update();
    }

    public void setSpr(double spr) {
        this.spr = spr;
        update();
    }

    public MonsterCategory getMonsterCategory() {
        return monsterCategory;
    }

    public MonsterType getMonsterType() {
        return monsterType;
    }

    public IntelligenceClass getIntelligenceClass() {
        return intelligenceClass;
    }

    public HpBase getHpBase() {
        return hpBase;
    }

    public MpBase getMpBase() {
        return mpBase;
    }

    public ArmorBase getArmorClass() {
        return armorClass;
    }

    public MagicArmorBase getMagicArmorBase() {
        return magicArmorBase;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public double getXpReward() {
        return xpReward;
    }

    public double getGilReward() {
        return gilReward;
    }

    public double getHp() {
        return hp;
    }

    public double getMp() {
        return mp;
    }

    public double getLevel() {
        return level;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public double getMagicAccuracy() {
        return magicAccuracy;
    }

    public double getDex() {
        return dex;
    }

    public double getMind() {
        return mind;
    }

    public double getEvasion() {
        return evasion;
    }

    public double getMagicEvasion() {
        return magicEvasion;
    }

    public double getStr() {
        return str;
    }

    public double getVit() {
        return vit;
    }

    public double getAgi() {
        return agi;
    }

    public double getSpd() {
        return spd;
    }

    public double getMag() {
        return mag;
    }

    public double getSpr() {
        return spr;
    }

    public double getArmor() {
        return armor;
    }

    public double getMagicArmor() {
        return mArmor;
    }

    public String getName(){return  name;}

    public double getStatTotal(){return (str+vit+agi+spd+mag+spr);}

    public void addAbility(Attack attack){
        attacks.add(attack);
        update();
    }

    public boolean removeAbility(Attack attack){
        boolean temp = false;
        temp = attacks.remove(attack);
         update();
         return temp;
    }

    public void addMovementModifier(MovementModifiers movementModifier){
        movementModifiers.add(movementModifier);
        update();
    }

    public boolean RemoveMovementModifier(MovementModifiers movementModifier){
        boolean temp = false;
        temp = movementModifiers.remove(movementModifier);
        update();
        return temp;
    }

    public void addSupportAbility(SupportAbilities supportability){
        supportAbilities.add(supportability);
        update();
    }

    public boolean removeSupportAbility(SupportAbilities supportAbility){
        boolean temp =  false;
        temp = supportAbilities.remove(supportAbility);
        update();
        return temp;
    }

    public void addFieldEffect(FieldEffects fieldEffect){
        fieldEffects.add(fieldEffect);
        update();
    }

    public boolean removeFieldEffect(FieldEffects fieldEffect){
        boolean temp = false;
        temp =fieldEffects.remove(fieldEffect);
        update();
        return temp;
    }

    public void addBossAbility(BossAbilities bossAbility){
        bossAbilities.add(bossAbility);
    }
    public boolean removeBossAbility(BossAbilities bossAbility){
        boolean temp = false;
        temp = bossAbilities.remove(bossAbility);
        update();
        return temp;
    }

    private void update(){
        updateStats();
        updateRewards();
    }

    private void updateStats(){
        hp = (hpBase.HIT_BASE*vit*level)* monsterType.HP_Mod;
        mp = (mpBase.MP_BASE*spr*level)* monsterType.MP_MOD;
        accuracy = 80+level+(agi*2);
        magicAccuracy=100+level+(mag*2);
        dex = 50+level+(agi*2);
        mind = 50+level+(mag*2);
        armor=(armorClass.BASE*level)+(vit/2);
        mArmor =(magicArmorBase.BASE*level)+(spr/2);
        evasion = level+spd+agi;
        magicEvasion = level+mag+spr;
    }

    private void updateRewards(){
        double tempXp = 0;
        double tempGil = 0;
        tempXp = monsterType.BASE_XP;
        tempGil = monsterType.BASE_GIL;
        tempXp += hpBase.XP_MOD;
        tempGil += hpBase.XP_MOD;
        tempXp += mpBase.XP_MOD;
        tempGil += mpBase.GIL_MOD;
        tempXp += armorClass.XP_MOD;
        tempGil += armorClass.GIL_MOD;
        tempXp += magicArmorBase.XP_MOD;
        tempGil += magicArmorBase.GIL_MOD;
        for (Attack attack : attacks) {
            tempXp+= attack.getXpMod();
            tempGil+= attack.getGilMod();
        }
        for (SimpleAbilities simpleabilities:simpleAbilities) {
            tempXp+= simpleabilities.xpMod;
            tempGil+= simpleabilities.gilMod;

        }
        for (SupportAbilities supportAbilities : supportAbilities) {
            tempXp += supportAbilities.XP_MOD;
            tempGil+= supportAbilities.GIL_MOD;
        }
        for (FieldEffects fieldEffect : fieldEffects) {
            tempXp += fieldEffect.XP_MOD;
            tempGil += fieldEffect.GIL_MOD;
        }
        for (BossAbilities bossAbility:bossAbilities) {
            tempXp += bossAbility.XP_MOD;
            tempGil += bossAbility.GIL_MOD;
        }
        xpReward = tempXp*level;
        gilReward = tempGil*level;
    }
}
