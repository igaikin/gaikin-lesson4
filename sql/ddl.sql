--CREATE DATABASE university_ig;

-- DROP TABLE students;
-- DROP TABLE teachers;

CREATE TABLE IF NOT EXISTS groups
(
    id                     BIGSERIAL PRIMARY KEY,
    name                   VARCHAR(50) NOT NULL,
    max_number_of_students INT DEFAULT 8
);

CREATE TABLE IF NOT EXISTS students
(
    id            BIGSERIAL PRIMARY KEY,
    first_name    VARCHAR(50) NOT NULL,
    last_name     VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    address       VARCHAR,
    course        INT,
    group_id      INT         NOT NULL REFERENCES groups,
    deleted       BOOLEAN     NOT NULL DEFAULT false
);

CREATE TABLE IF NOT EXISTS teachers
(
    id              BIGSERIAL PRIMARY KEY,
    first_name      VARCHAR(50) NOT NULL,
    last_name       VARCHAR(50) NOT NULL,
    date_of_birth   DATE,
    address         VARCHAR,
    group_id        INT REFERENCES groups,
    chair           VARCHAR(50),
    academic_degree VARCHAR(50),
    deleted         BOOLEAN     NOT NULL DEFAULT false
);

-- CREATE TABLE IF NOT EXISTS faculty (
--     id INT PRIMARY KEY,
--     faculty_name VARCHAR(50) NOT NULL,