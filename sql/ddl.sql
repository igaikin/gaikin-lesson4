CREATE DATABASE university;

CREATE TABLE IF NOT EXISTS students (
    id BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
	date_of_birth DATE,
	address VARCHAR,
	faculty_id VARCHAR(30),
	course INT,
	group_number INT,
    deleted BOOLEAN NOT NULL DEFAULT false
);

CREATE TABLE IF NOT EXISTS teachers (
	id BIGSERIAL PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
	date_of_birth DATE,
	address VARCHAR,
	group_number INT,
	chair VARCHAR(50),
	academic_degree VARCHAR(50),
	deleted BOOLEAN NOT NULL DEFAULT false
);

CREATE TABLE IF NOT EXISTS faculty (
    id INT PRIMARY KEY,
    faculty_name VARCHAR(50) NOT NULL,