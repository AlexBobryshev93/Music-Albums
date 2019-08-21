CREATE TABLE IF NOT EXISTS Albums
(
    id bigint NOT NULL,
    name character varying(25) COLLATE pg_catalog."default" NOT NULL,
    year bigint,
    performer bigint,
    CONSTRAINT "Albums_pkey" PRIMARY KEY (id),
    CONSTRAINT "Performers_FK" FOREIGN KEY (performer)
        REFERENCES Performers (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

CREATE TABLE IF NOT EXISTS Performers
(
    id bigint NOT NULL,
    name character varying(25) COLLATE pg_catalog."default" NOT NULL,
    genre character varying(10) COLLATE pg_catalog."default",
    CONSTRAINT "Performers_pkey" PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;
