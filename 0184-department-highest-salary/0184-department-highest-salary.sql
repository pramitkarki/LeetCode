# Write your MySQL query statement below

select d.name as Department, e.name as Employee, Salary from
employee e
inner join department d
on e.departmentId = d.id
where (salary, departmentId) in (select max(salary),departmentId from employee group by departmentId);