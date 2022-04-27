--liquibase formatted sql
--changeset nkulachenkov:1
CREATE TABLE users(
    id SERIAL,
    email TEXT
);