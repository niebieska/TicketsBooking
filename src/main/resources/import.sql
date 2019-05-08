
DELETE FROM movieHours;
DELETE FROM movieTypes;
DELETE FROM movies

INSERT INTO movies(id_movie, title, description, image, genre, duration) VALUES (1, 'Avengers: Endgame', 'Po wymazaniu połowy życia we Wszechświecie przez Thanosa, Avengersi starają się zrobić wszystko co konieczne, aby pokonać szalonego tytana.', 'http://cdn.collider.com/wp-content/uploads/2019/04/avengers-endgame-poster-3d-411x600.png', 'Action / Sci-Fi', 182);
INSERT INTO movies(id_movie, title, description, image, genre, duration) VALUES (2, 'Belzebub', 'Detektyw, który w tragicznych okolicznościach stracił rodzinę, prowadzi śledztwo w sprawie szkolnej strzelaniny.', 'https://ssl-gfx.filmweb.pl/po/54/60/805460/7879622.6.jpg', 'Horror', 114);

INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (1, '2D DUBB', 1);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (2, '2D NAP PL', 1);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (3, '3D DUBB', 1);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (4, '3D NAP PL', 1);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (5, 'IMAX 3D DUBB', 1);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (6, 'IMAX 3D NAP PL', 1);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (7, '2D NAP PL', 2);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (8, '3D NAP PL', 2);

INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (1, '9:00', 1);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (2, '12:00', 1);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (3, '14:00', 2);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (4, '16:30', 2);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (5, '21:10', 2);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (6, '9:00', 3);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (7, '11:30', 3);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (8, '18:30', 3);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (9, '20:45', 4);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (10, '22:10', 4);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (11, '12:45', 5);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (12, '15:00', 5);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (13, '16:45', 6);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (14, '21:45', 6);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (15, '18:30', 7);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (16, '19:45', 7);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (17, '22:30', 7);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (18, '18:00', 8);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (19, '22:15', 8);
