--psql -U postgres
--\cd 'C:/ELENA/StartJava/src/com/startjava/lesson_5'
--\ir 'create_db.sql'
--==========================================================
--\c postgres;
--\c jaegers;
--DROP TABLE IF EXISTS Jaegers;
\C postgres;
DROP DATABASE IF EXISTS jaegers;
CREATE DATABASE jaegers;
\C jaegers;
CREATE TABLE Jaegers(
    id        serial PRIMARY KEY,
    modelName text,
    mark      text,
    height    real,
    weight    real,
    status    text,
    origin    text,
    launch    date,
    kaijuKill integer
);
\ir 'init_db.sql'
\ir 'queries.sql'