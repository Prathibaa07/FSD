create database Nov11;
use nov11;

create table class(ID int not null primary key, Name varchar(50), Course varchar(50));
Insert into class (ID, Name, Course) VALUES (1, "Prathi", "BCA"), (2, "Bala", "MSC"), (3, "Kalai", "ECE");

create table info(ID int, City varchar(50));
Insert into info(ID, City) VALUES (1, "Coimbatore"), (2, "Bangalore"), (4, "Chennai");

select * from class;
select * from info;

select * from class CROSS JOIN info;