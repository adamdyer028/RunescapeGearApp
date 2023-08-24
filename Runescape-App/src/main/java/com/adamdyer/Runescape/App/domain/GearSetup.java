package com.adamdyer.Runescape.App.domain;

import jakarta.persistence.*;

import java.util.stream.Stream;

@Entity
public class GearSetup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private GearItem weapon;
    @ManyToOne
    private GearItem offHand;
    @ManyToOne
    private GearItem helmet;
    @ManyToOne
    private GearItem necklace;
    @ManyToOne
    private GearItem chest;
    @ManyToOne
    private GearItem legs;
    @ManyToOne
    private GearItem boots;
    @ManyToOne
    private GearItem cape;
    @ManyToOne
    private GearItem bracelet;
    @ManyToOne
    private GearItem ring;
    @ManyToOne
    private GearItem ammo;
    @OneToOne
    private User user;
    public int calcStabAtt() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getStabAtt)
                .sum();
    }
    public int calcSlashAtt() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getSlashAtt)
                .sum();
    }
    public int calcCrushAtt() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getCrushAtt)
                .sum();
    }
    public int calcMagicAtt() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getMagicAtt)
                .sum();
    }
    public int calcRangedAtt() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getRangeAtt)
                .sum();
    }
    public int calcStabDef() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getStabDef)
                .sum();
    }
    public int calcSlashDef() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getSlashDef)
                .sum();
    }
    public int calcCrushDef() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getCrushDef)
                .sum();
    }
    public int calcMagicDef() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getMagicDef)
                .sum();
    }
    public int calcRangedDef() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getRangeDef)
                .sum();
    }
    public int calcStr() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getStrength)
                .sum();
    }
    public int calcRangedStr() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getRangedStrength)
                .sum();
    }
    public int calcMagicDmg() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getMagicDamage)
                .sum();
    }
    public int calcPrayer() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getPrayerBonus)
                .sum();
    }
    public int calcWeight() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getWeight)
                .sum();
    }
    public int calcValue() {
        return Stream.of(weapon, offHand, helmet, necklace, chest, legs, boots, cape, bracelet, ring, ammo)
                .mapToInt(GearItem::getValue)
                .sum();
    }

    public GearSetup() {
    }

    public Long getId() {
        return id;
    }

    public GearItem getWeapon() {
        return weapon;
    }

    public void setWeapon(GearItem weapon) {
        this.weapon = weapon;
    }

    public GearItem getOffHand() {
        return offHand;
    }

    public void setOffHand(GearItem offHand) {
        this.offHand = offHand;
    }

    public GearItem getHelmet() {
        return helmet;
    }

    public void setHelmet(GearItem helmet) {
        this.helmet = helmet;
    }

    public GearItem getNecklace() {
        return necklace;
    }

    public void setNecklace(GearItem necklace) {
        this.necklace = necklace;
    }

    public GearItem getChest() {
        return chest;
    }

    public void setChest(GearItem chest) {
        this.chest = chest;
    }

    public GearItem getLegs() {
        return legs;
    }

    public void setLegs(GearItem legs) {
        this.legs = legs;
    }

    public GearItem getBoots() {
        return boots;
    }

    public void setBoots(GearItem boots) {
        this.boots = boots;
    }

    public GearItem getCape() {
        return cape;
    }

    public void setCape(GearItem cape) {
        this.cape = cape;
    }

    public GearItem getBracelet() {
        return bracelet;
    }

    public void setBracelet(GearItem bracelet) {
        this.bracelet = bracelet;
    }

    public GearItem getRing() {
        return ring;
    }

    public void setRing(GearItem ring) {
        this.ring = ring;
    }

    public GearItem getAmmo() {
        return ammo;
    }

    public void setAmmo(GearItem ammo) {
        this.ammo = ammo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
