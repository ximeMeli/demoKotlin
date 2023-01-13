
INSERT INTO `alumno`(`id`,`nombre`,`apellido`)
values (1,'alumno1','apellido1'),
       (2,'alumno2','apellido2'),
       (3,'alumna3','apellido3');


INSERT INTO `clase`(`id`, `nombre`,`horario`)
values (1, 'clase1','10:00:00'),
       (2, 'clase2','11:00:00'),
       (3, 'clase3','12:00:00');

INSERT INTO `alumno_clase`(`id_alumno`,`id_clase`)
values (1,1),
       (2,2),
       (3,3);