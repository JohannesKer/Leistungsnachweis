package com.JohannesGroup.Programmieren.Monopoli;

import jakarta.persistence.*;

@Entity
@Table(name = "banks")
public class BankEntity {
    @Id
    private Integer id;
    @Column
    private String name;
    @Version
    private int version;


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
