create database payroll_service;
show databases;
use payroll_service;
create table employee_payroll(id int auto_increment ,
name varchar(150),
salary double,
start date,
primary key (id));
select * from employee_payroll;
INSERT INTO employee_payroll (name,salary,start ) VALUES 
('bill',10000.00,'01-01-14'),
('mark',20000.00,'02-02-15'),
('charlie',30000.00,'03-03-16');
select * from employee_payroll;
select salary from employee_payroll where name='bill';
Alter table employee_payroll add gender char(1) AFTER start;
UPDATE employee_payroll set gender =
'M' where name = 'Bill' or name =
'mark' or name ='charlie';
SELECT AVG(salary) FROM employee_payroll
WHERE gender = 'M' GROUP BY gender;
SELECT SUM(salary) FROM employee_payroll
WHERE gender = 'M' GROUP BY gender;