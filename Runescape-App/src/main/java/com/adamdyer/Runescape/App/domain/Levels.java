package com.adamdyer.Runescape.App.domain;

import jakarta.persistence.*;

@Entity
public class Levels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer hp;
    private Integer attack;
    private Integer strength;
    private Integer defence;
    private Integer ranged;
    private Integer magic;
    private Integer prayer;
    @OneToOne
    private User user;

    public Levels() {
    }

    public Long getId() {
        return id;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getRanged() {
        return ranged;
    }

    public void setRanged(Integer ranged) {
        this.ranged = ranged;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public Integer getPrayer() {
        return prayer;
    }

    public void setPrayer(Integer prayer) {
        this.prayer = prayer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
