
DELETE FROM movieHours;
DELETE FROM movieTypes;
DELETE FROM movies

INSERT INTO movies(id_movie, title, description, image, genre, duration) VALUES (1, 'Avengers: Endgame', 'Opis avengers', 'http://cdn.collider.com/wp-content/uploads/2019/04/avengers-endgame-poster-3d-411x600.png', 'Action / Sci-Fi', 182);
INSERT INTO movies(id_movie, title, description, image, genre, duration) VALUES (2, 'Belzebub', 'Opis belzebub', 'https://ssl-gfx.filmweb.pl/po/54/60/805460/7879622.6.jpg', 'Horror', 114);

INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (1, '2D NAP PL', 1);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (2, '3D DUBB', 1);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (3, '2D DUBB', 2);
INSERT INTO movieTypes(id_movieType, name, id_movie) VALUES (4, '3D NAP PL', 2);

INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (1, '9:00', 1);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (2, '12:00', 1);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (3, '14:00', 2);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (4, '15:00', 2);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (5, '20:30', 3);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (6, '22:00', 3);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (7, '20:45', 4);
INSERT INTO movieHours(id_movieHour, hour, id_movieType) VALUES (8, '22:10', 4);