CREATE TABLE IF NOT EXISTS anwender (
    id bigint PRIMARY KEY,
    version int NOT NULL,
    name character varying(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS todolists (
    id bigint PRIMARY KEY,
    version int NOT NULL,
    name character varying(20) NOT NULL,
    anwenderid bigint NOT NULL
);

CREATE TABLE IF NOT EXISTS items (
    id bigint PRIMARY KEY,
    version int NOT NULL,
    description character varying(100) NOT NULL,
    done tinyint not null,
    todolistid bigint NOT NULL
);

ALTER TABLE todolists
    ADD FOREIGN KEY (userid) REFERENCES users(id);

ALTER TABLE items
    ADD FOREIGN KEY (todolistid) REFERENCES todolists(id);


