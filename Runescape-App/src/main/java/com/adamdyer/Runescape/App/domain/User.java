package com.adamdyer.Runescape.App.domain;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private LocalDate birthDate;
    private String rsn;
    @OneToOne
    private MeleeSetup meleeSetup;
    @OneToOne
    private RangedSetup rangedSetup;
    @OneToOne
    private MageSetup mageSetup;
    @OneToOne
    private Levels levels;
    private Integer bankValue;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getRsn() {
        return rsn;
    }

    public void setRsn(String rsn) {
        this.rsn = rsn;
    }

    public MeleeSetup getMeleeSetup() {
        return meleeSetup;
    }

    public void setMeleeSetup(MeleeSetup meleeSetup) {
        this.meleeSetup = meleeSetup;
    }

    public RangedSetup getRangedSetup() {
        return rangedSetup;
    }

    public void setRangedSetup(RangedSetup rangedSetup) {
        this.rangedSetup = rangedSetup;
    }

    public MageSetup getMageSetup() {
        return mageSetup;
    }

    public void setMageSetup(MageSetup mageSetup) {
        this.mageSetup = mageSetup;
    }

    public Levels getLevels() {
        return levels;
    }

    public void setLevels(Levels levels) {
        this.levels = levels;
    }

    public Integer getBankValue() {
        return bankValue;
    }

    public void setBankValue(Integer bankValue) {
        this.bankValue = bankValue;
    }
}
