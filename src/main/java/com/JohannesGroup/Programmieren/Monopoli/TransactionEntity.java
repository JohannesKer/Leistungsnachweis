package com.JohannesGroup.Programmieren.Monopoli;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_gen")
    @SequenceGenerator(name = "transaction_gen", sequenceName = "SEQ_TRANSACTIONS", allocationSize = 1)
    private Integer id;
    @Version
    private int version;
    @Column
    private int amount;
    @OneToOne
    @JoinColumn(name="senderid")
    private PlayerEntity sender;

    @OneToOne
    @JoinColumn(name="recipientid")
    private PlayerEntity recipient;

    @OneToOne
    @JoinColumn(name="bankid")
    private BankEntity bank;

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PlayerEntity getSender() {
        return sender;
    }

    public void setSender(PlayerEntity sender) {
        this.sender = sender;
    }

    public PlayerEntity getRecipient() {
        return recipient;
    }

    public void setRecipient(PlayerEntity recipient) {
        this.recipient = recipient;
    }

    public BankEntity getBank() {
        return bank;
    }

    public void setBank(BankEntity bank) {
        this.bank = bank;
    }
}
