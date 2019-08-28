CREATE TABLE IF NOT EXISTS performers
(
    id BIGINT NOT NULL PRIMARY KEY,
    name CHARACTER VARYING(25) NOT NULL
);

CREATE TABLE IF NOT EXISTS albums
(
    id BIGINT NOT NULL PRIMARY KEY,
    name CHARACTER VARYING(50) NOT NULL,
    year BIGINT,
    performer CHARACTER VARYING(25),
    genre CHARACTER VARYING(25)
);

-- DB should ne redesigned with using of FK
--ALTER TABLE albums
    --ADD FOREIGN KEY (performer) REFERENCES performers(name) ;

