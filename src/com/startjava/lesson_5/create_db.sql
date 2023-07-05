--psql -U postgres
--\cd 'C:/ELENA/StartJava/src/com/startjava/lesson_5'
--\ir 'create_db.sql'
--==========================================================
--\c postgres;
--\c jaegers;
--DROP TABLE IF EXISTS Jaegers;
DROP DATABASE IF EXISTS jaegers;
CREATE DATABASE jaegers;

\C jaegers;

CREATE TABLE Jaegers (
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      TEXT,
    height    REAL,
    weight    REAL,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);

\ir 'init_db.sql'

\ir 'queries.sql'