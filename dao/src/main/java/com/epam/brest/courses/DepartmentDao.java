package com.epam.brest.courses;import java.util.List;public interface DepartmentDao {    List<Department> getDepartments();    Department getDepartmentById(Integer DepartmentId);    Department addDepartment(Department department);    void updateDepartment(Department department);    void deleteDepartment(Integer DepartmentId);}