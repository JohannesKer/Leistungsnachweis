CREATE TABLE IF NOT EXISTS players (
    id int PRIMARY KEY,
    version int NOT NULL,
    name character varying(30) NOT NULL,
    accountid int NOT NULL
    );

CREATE TABLE IF NOT EXISTS accounts (
    id int PRIMARY KEY,
    version int NOT NULL,
    accountnumber character varying(10) NOT NULL,
    balance int NOT NULL,
    bankid int NOT NULL
    );

CREATE TABLE IF NOT EXISTS banks (
    id int PRIMARY KEY,
    version int NOT NULL,
    name character varying(50) NOT NULL
    );

CREATE TABLE IF NOT EXISTS transactions (
    id int PRIMARY KEY,
    version int NOT NULL,
    senderid int NOT NULL,
    recipientid int NOT NULL,
    amount int NOT NULL,
    bankid int NOT NULL
);


ALTER TABLE players
    ADD FOREIGN KEY (accountid) REFERENCES accounts(id);

ALTER TABLE accounts
    ADD FOREIGN KEY (bankid) REFERENCES banks(id);

ALTER TABLE transactions
    ADD FOREIGN KEY (bankid) REFERENCES banks(id);

ALTER TABLE transactions
    ADD FOREIGN KEY (senderid) REFERENCES players(id);

ALTER TABLE transactions
    ADD FOREIGN KEY (recipientid) REFERENCES players(id);


CREATE SEQUENCE IF NOT EXISTS SEQ_TRANSACTIONS AS BIGINT START WITH 1;
