CREATE DATABASE test
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;

CREATE TABLE employee
(
  age integer NOT NULL,
  name character varying NOT NULL,
  id character varying NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE employee
  OWNER TO postgres;
