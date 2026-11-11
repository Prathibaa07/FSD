use nov11;

SELECT Employees.emp_id, Employees.emp_name, Employees.salary, Departments.dept_name FROM Employees LEFT JOIN Departments ON Employees.dept_id = Departments.dept_id;