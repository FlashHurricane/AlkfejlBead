INSERT INTO training (title, trainer, description, place, capacity, status, created_at, modified_at)
    VALUES ('Úszás', 'Molnár Béla', '90 perces vegyes úszás', 'Horváth Béla uszoda', 15, COMING, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
INSERT INTO training (title, trainer, description, place, capacity, status, created_at, modified_at)
    VALUES ('Spinning', 'Gipsz Jakab', '60 perces Spinning', 'Oxygen Fáy', 30, COMING, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
INSERT INTO training (title, trainer, description, place, capacity, status, created_at, modified_at)
    VALUES ('Kondi-mix', 'Frederik Blueberry', 'Erő-állóképességi edzés', 'Red gym', 20, ENDED, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());

INSERT INTO user (name) VALUES ('Béla');
INSERT INTO user (name) VALUES ('Jakab');
INSERT INTO user (name) VALUES ('Frederik');

INSERT INTO message (body, created_at, training_id, user_id) VALUES ('Az edzés elmarad', CURRENT_TIMESTAMP(), 3, 3);

INSERT INTO label (text) VALUES ('úszás');
INSERT INTO label (text) VALUES ('Spinning');
INSERT INTO label (text) VALUES ('erőnléti');

INSERT INTO issue_labels (trainings_id, labels_id) VALUES (1, 1);
INSERT INTO issue_labels (trainings_id, labels_id) VALUES (2, 2);
INSERT INTO issue_labels (trainings_id, labels_id) VALUES (3, 3);