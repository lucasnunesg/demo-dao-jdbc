package com.lucas.application;

import com.lucas.model.dao.DaoFactory;
import com.lucas.model.dao.DepartmentDao;
import com.lucas.model.dao.SellerDao;
import com.lucas.model.entities.Department;
import com.lucas.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("TEST 1: Department Insert");
        Department newDepartment = new Department();
        newDepartment.setName("Tools");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("TEST 2: Department Update");
        Department department = departmentDao.findById(1);
        department.setName("Miscellaneous");
        departmentDao.update(department);
        System.out.println("Update completed");


        System.out.println("TEST 3: Department Find All");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println("TEST 4: Department Delete By Id");
        System.out.print("Select ID do delete: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deleted Successfully!");

        sc.close();
    }
}
