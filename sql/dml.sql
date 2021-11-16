-- SELECT * FROM groups;
-- DELETE FROM groups;
-- SELECT * FROM students;
-- DELETE FROM students;

INSERT INTO groups (name, max_number_of_students)
VALUES ('First', 8),
       ('Second', 10);

INSERT INTO students (first_name, last_name, date_of_birth, address, course, group_id)
VALUES ('Muammar', 'Gaddafi', '1942.06.07', 'LBY, Tripoli, Tarik al Seka, 58', 1, (SELECT id FROM groups WHERE name = 'First')),
       ('Osama', 'bin Ladenen', '1957.03.10', 'PAK, Abbottabad, Kehal, 46', 1, (SELECT id FROM groups WHERE name = 'Second')),
       ('Adolf', 'Hitler', '1889.04.20', 'DEU, Berlin, Ebertstraße, 15', 1, (SELECT id FROM groups WHERE name = 'First')),
       ('Saddam', 'Hussein', '1931.04.28', 'IRQ, Baghdad, building without address', 1, (SELECT id FROM groups WHERE name = 'Second')),
       ('Bashar', 'al-Assad', '1965.09.11', 'SYR, Damascus, Kafr Sousa - in front of Al-Assad Hospital', 1, (SELECT id FROM groups WHERE name = 'Second')),
       ('Idi', 'Amin', '1925.05.17', 'UGA, Kampala, Apollo Kaggwa Rd, 9, 11', 1, (SELECT id FROM groups WHERE name = 'First')),
       ('Joseph', 'Stalin', '1878.12.18', 'USSR, Moscow, Kolmogorova, 1', 1, (SELECT id FROM groups WHERE name = 'Second')),
       ('Alesandro', 'Shoushenko', '1954.08.30', 'BLR, Minsk, Pobediteley, 15', 1, (SELECT id FROM groups WHERE name = 'First'));

INSERT INTO teachers (first_name, last_name, date_of_birth, address, group_id, chair, academic_degree)
VALUES ('Irod', 'The Great', '1990.01.01', 'BLR, Shklou, 1', (SELECT id FROM groups WHERE name = 'First'), 'Some chair', 'MASTER'),
       ('Max', 'Mad', '1956.01.01', 'BLR, Alexandria, 1', (SELECT id FROM groups WHERE name = 'Second'), 'Some chair', 'BACHELOR');

