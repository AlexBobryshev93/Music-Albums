CREATE TABLE IF NOT EXISTS performers
(
    id bigint NOT NULL PRIMARY KEY,
    name character varying(25) NOT NULL
);

-- FK needs to be added
CREATE TABLE IF NOT EXISTS albums
(
    id bigint NOT NULL PRIMARY KEY,
    name character varying(50) NOT NULL,
    year bigint,
    performer character varying(25),
    genre character varying(25)
);

