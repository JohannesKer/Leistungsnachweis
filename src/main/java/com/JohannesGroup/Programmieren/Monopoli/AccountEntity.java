package com.JohannesGroup.Programmieren.Monopoli;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class AccountEntity {
    @Id
    private Integer id;
    @Version
    private int version;
    @Column
    private String accountnumber;
    @Column
    private Integer balance;


    public void subtractAmountFromBalance (int amount) {
        this.balance = this.balance - amount;
    }

    public void addAmountToBalance (int amount) {
        this.balance = this.balance + amount;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
