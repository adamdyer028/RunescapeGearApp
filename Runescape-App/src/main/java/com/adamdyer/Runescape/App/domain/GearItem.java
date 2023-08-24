package com.adamdyer.Runescape.App.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class GearItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer speed;
    private Integer stabAtt;
    private Integer slashAtt;
    private Integer crushAtt;
    private Integer magicAtt;
    private Integer rangeAtt;

    private Integer stabDef;
    private Integer slashDef;
    private Integer crushDef;
    private Integer magicDef;
    private Integer rangeDef;

    private Integer strength;
    private Integer rangedStrength;
    private Integer magicDamage;
    private Integer prayerBonus;
    private Integer weight;
    private Integer value;
    private Boolean setEffect;
    @ManyToOne
    private GearSetup gearSetup;

    public GearItem() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getStabAtt() {
        return stabAtt;
    }

    public void setStabAtt(Integer stabAtt) {
        this.stabAtt = stabAtt;
    }

    public Integer getSlashAtt() {
        return slashAtt;
    }

    public void setSlashAtt(Integer slashAtt) {
        this.slashAtt = slashAtt;
    }

    public Integer getCrushAtt() {
        return crushAtt;
    }

    public void setCrushAtt(Integer crushAtt) {
        this.crushAtt = crushAtt;
    }

    public Integer getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(Integer magicAtt) {
        this.magicAtt = magicAtt;
    }

    public Integer getRangeAtt() {
        return rangeAtt;
    }

    public void setRangeAtt(Integer rangeAtt) {
        this.rangeAtt = rangeAtt;
    }

    public Integer getStabDef() {
        return stabDef;
    }

    public void setStabDef(Integer stabDef) {
        this.stabDef = stabDef;
    }

    public Integer getSlashDef() {
        return slashDef;
    }

    public void setSlashDef(Integer slashDef) {
        this.slashDef = slashDef;
    }

    public Integer getCrushDef() {
        return crushDef;
    }

    public void setCrushDef(Integer crushDef) {
        this.crushDef = crushDef;
    }

    public Integer getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(Integer magicDef) {
        this.magicDef = magicDef;
    }

    public Integer getRangeDef() {
        return rangeDef;
    }

    public void setRangeDef(Integer rangeDef) {
        this.rangeDef = rangeDef;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getRangedStrength() {
        return rangedStrength;
    }

    public void setRangedStrength(Integer rangedStrength) {
        this.rangedStrength = rangedStrength;
    }

    public Integer getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(Integer magicDamage) {
        this.magicDamage = magicDamage;
    }

    public Integer getPrayerBonus() {
        return prayerBonus;
    }

    public void setPrayerBonus(Integer prayerBonus) {
        this.prayerBonus = prayerBonus;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Boolean getSetEffect() {
        return setEffect;
    }

    public void setSetEffect(Boolean setEffect) {
        this.setEffect = setEffect;
    }

    public GearSetup getGearSetup() {
        return gearSetup;
    }

    public void setGearSetup(GearSetup gearSetup) {
        this.gearSetup = gearSetup;
    }
}
