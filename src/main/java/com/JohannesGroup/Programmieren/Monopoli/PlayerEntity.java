package com.JohannesGroup.Programmieren.Monopoli;

import jakarta.persistence.*;
@Entity
@Table(name = "players")
public class PlayerEntity {

    @Id
    private Integer id;
    @Column
    private String name;
    @Version
    private int version;

    @OneToOne
    @JoinColumn(name="accountid")
    private AccountEntity account;

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
