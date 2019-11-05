/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

INSERT INTO training (title, trainer, description, place, free_spaces, created_at, modified_at) VALUES ('Úszás', 'Molnár Béla', '90 perces vegyes úszás', 'Horváth Béla uszoda', '30', CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
INSERT INTO training (title, trainer, description, place, free_spaces, created_at, modified_at) VALUES ('Spinning','Gipsz Jakab', '60 perces Spinning edzés', 'Oxygen Fáy', '40', CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
INSERT INTO training (title, trainer, description, place, free_spaces, created_at, modified_at) VALUES ('Úszás', 'Frederik Blueberry', 'Erő-állóképességi edzés', 'Oxygen Fáy', '15', CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());

INSERT INTO user (name, username, password, role) VALUES ('Tibor', 'tibor', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', 'ROLE_ADMIN');
INSERT INTO user (name, username, password, role) VALUES ('László', 'laszlo', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', 'ROLE_USER');
INSERT INTO user (name, username, password, role) VALUES ('Péter', 'peter', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', 'ROLE_USER');

--INSERT INTO message (body, created_at, issue_id, user_id) VALUES ('Már csak egy szabad hely', CURRENT_TIMESTAMP(), 1, 1);

INSERT INTO label (text) VALUES ('közelgő');
INSERT INTO label (text) VALUES ('betelt');


INSERT INTO training_labels (trainings_id, labels_id) VALUES (1, 1);
INSERT INTO training_labels (trainings_id, labels_id) VALUES (1, 2);

/**
 * Author:  Apor
 * Created: 2019.11.05.
 */

