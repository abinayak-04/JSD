create database Student_data;
use Student_data;
create table login_stud(regno varchar(25) primary key,stud_name varchar(25),stud_dob date);
insert into login_stud values(830122104002,"Abinaya shree ","2004-09-12");

INSERT INTO login_stud (regno, stud_name, stud_dob) VALUES
('830122104005', 'Elango S', '2004-01-25'),
('830122104006', 'Farhana Begum', '2003-09-12'),
('830122104007', 'Gokulnath M', '2004-05-30'),
('830122104008', 'Harini K', '2004-12-04'),
('830122104009', 'Inbasekar P', '2003-08-18'),
('830122104010', 'Janani S', '2004-04-22'),
('830122104011', 'Karthik Raja', '2003-10-10'),
('830122104012', 'Nisanth N', '2005-06-20'),
('830122104013', 'Nikitha S ', '2003-01-10'),
('830122104014', 'Pavya V', '2004-01-10');
select * from Student_data.login_stud;

create table student_marks(regno varchar(25) references login_stud(regno),
sub_code varchar(20),sub_name varchar(30),marks int,grade varchar(5));
INSERT INTO student_marks (regno, sub_code, sub_name, marks, grade) VALUES
('830122104002', 'CS3401', 'Database Management Systems', 77, 'A'),
('830122104002', 'CS3402', 'Operating Systems', 87, 'A+'),
('830122104002', 'CS3403', 'Java Programming', 92, 'O');


INSERT INTO student_marks (regno, sub_code, sub_name, marks, grade, result) VALUES
-- Charan Kumar (830122104003)
('830122104003', 'CS3401', 'Database Management Systems', 92, 'O', 'PASS'),
('830122104003', 'CS3402', 'Operating Systems', 85, 'A+', 'PASS'),
('830122104003', 'CS3403', 'Java Programming', 78, 'A', 'PASS'),

-- Dhanush V (830122104004)
('830122104004', 'CS3401', 'Database Management Systems', 65, 'B+', 'PASS'),
('830122104004', 'CS3402', 'Operating Systems', 81, 'A+', 'PASS'),
('830122104004', 'CS3403', 'Java Programming', 58, 'B', 'PASS'),

-- Elango S (830122104005)
('830122104005', 'CS3401', 'Database Management Systems', 38, 'RA', 'RA'),
('830122104005', 'CS3402', 'Operating Systems', 55, 'B', 'PASS'),
('830122104005', 'CS3403', 'Java Programming', 44, 'RA', 'RA'),

-- Farhana Begum (830122104006)
('830122104006', 'CS3401', 'Database Management Systems', 95, 'O', 'PASS'),
('830122104006', 'CS3402', 'Operating Systems', 89, 'A+', 'PASS'),
('830122104006', 'CS3403', 'Java Programming', 91, 'O', 'PASS'),

-- Gokulnath M (830122104007)
('830122104007', 'CS3401', 'Database Management Systems', 73, 'A', 'PASS'),
('830122104007', 'CS3402', 'Operating Systems', 68, 'B+', 'PASS'),
('830122104007', 'CS3403', 'Java Programming', 71, 'A', 'PASS'),

-- Harini K (830122104008)
('830122104008', 'CS3401', 'Database Management Systems', 85, 'A+', 'PASS'),
('830122104008', 'CS3402', 'Operating Systems', 42, 'RA', 'RA'),
('830122104008', 'CS3403', 'Java Programming', 79, 'A', 'PASS'),

-- Inbasekar P (830122104009)
('830122104009', 'CS3401', 'Database Management Systems', 52, 'B', 'PASS'),
('830122104009', 'CS3402', 'Operating Systems', 61, 'B+', 'PASS'),
('830122104009', 'CS3403', 'Java Programming', 50, 'B', 'PASS'),

-- Janani S (830122104010)
('830122104010', 'CS3401', 'Database Management Systems', 90, 'O', 'PASS'),
('830122104010', 'CS3402', 'Operating Systems', 94, 'O', 'PASS'),
('830122104010', 'CS3403', 'Java Programming', 88, 'A+', 'PASS'),

-- Karthik Raja (830122104011)
('830122104011', 'CS3401', 'Database Management Systems', 48, 'RA', 'RA'),
('830122104011', 'CS3402', 'Operating Systems', 76, 'A', 'PASS'),
('830122104011', 'CS3403', 'Java Programming', 62, 'B+', 'PASS'),

-- Nisanth N (830122104012)
('830122104012', 'CS3401', 'Database Management Systems', 82, 'A+', 'PASS'),
('830122104012', 'CS3402', 'Operating Systems', 74, 'A', 'PASS'),
('830122104012', 'CS3403', 'Java Programming', 80, 'A+', 'PASS'),

-- Nikitha S (830122104013)
('830122104013', 'CS3401', 'Database Management Systems', 87, 'A+', 'PASS'),
('830122104013', 'CS3402', 'Operating Systems', 91, 'O', 'PASS'),
('830122104013', 'CS3403', 'Java Programming', 83, 'A+', 'PASS'),

-- Pavya V (830122104014)
('830122104014', 'CS3401', 'Database Management Systems', 67, 'B+', 'PASS'),
('830122104014', 'CS3402', 'Operating Systems', 85, 'A+', 'PASS'),
('830122104014', 'CS3403', 'Java Programming', 72, 'A', 'PASS');
select * from Student_data.student_marks;
ALTER TABLE student_marks ADD COLUMN result VARCHAR(10);
UPDATE student_marks SET result = 'PASS' WHERE marks >= 50;
UPDATE student_marks SET result = 'RA' WHERE marks < 50;