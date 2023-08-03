# Write your MySQL query statement below
select e1.name as 'Employee'
from Employee e1, Employee m
where e1.managerId = m.id
and e1.salary > m.salary;