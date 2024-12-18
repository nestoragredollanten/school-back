INSERT INTO school (id, name) VALUES (1, 'El colegio del Olimpo');

INSERT INTO course (id, grade, room, school_id) VALUES
(1, 10, 'A', 1), (2, 10, 'B', 1), (3, 11, 'A', 1), (4, 11, 'B', 1);

INSERT INTO professor (id, name) VALUES
(1, 'Némesis'), (2, 'Príapo'), (3, 'Iris');

INSERT INTO subject (id, name, course_id, professor_id) VALUES
(1, 'Matemáticas', 1, 1), (2, 'Español', 1, 2), (3, 'Ingles básico', 1, 3),
(4, 'Matemáticas', 2, 1), (5, 'Español', 2, 2), (6, 'Ingles avanzado', 2, 3),
(7, 'Matemáticas', 3, 1), (8, 'Pre Icfes', 3, 1),
(9, 'Matemáticas', 4, 1), (10, 'Pre Icfes', 4, 1);

INSERT INTO student (id, name) VALUES
(1, 'Afrodita'), (2, 'Apolo'), (3, 'Ares'),
(4, 'Artemisa'), (5, 'Atenea'), (6, 'Dionisio'),
(7, 'Hefesto'), (8, 'Hera'),
(9, 'Hermes'), (10, 'Hades'), (11, 'Poseidón'), (12, 'Zeus');

INSERT INTO student_subject (student_id, subject_id) VALUES
(1, 1), (1, 2), (1, 3),
(2, 1), (2, 2), (2, 3),
(3, 1), (3, 2), (3, 3),
(4, 4), (4, 5), (4, 6),
(5, 4), (5, 5), (5, 6),
(6, 4), (6, 5), (6, 6),
(7, 7), (7, 8),
(8, 7), (8, 8),
(9, 9), (9, 10),
(10,9), (10, 10),
(11,9), (11, 10),
(12,9), (12, 10);