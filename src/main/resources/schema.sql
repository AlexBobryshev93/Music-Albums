--SHOW search_path;
--SET search_path TO public;

CREATE TABLE IF NOT EXISTS performers
(
    id bigint NOT NULL PRIMARY KEY,
    name character varying(25) NOT NULL,
    genre character varying(10)
);

