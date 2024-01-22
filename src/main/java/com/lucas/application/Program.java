package com.lucas.application;

import com.lucas.model.dao.DaoFactory;
import com.lucas.model.dao.DepartmentDao;
import com.lucas.model.dao.SellerDao;
import com.lucas.model.entities.Department;
import com.lucas.model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        SellerDao sellerDao = DaoFactory.createSellerDao();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("TEST 1: Seller Find By Id:");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\nTEST 2: Seller Find By Department:");
        Department department = departmentDao.findById(1);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println("Objeto: " + obj);
        }

        System.out.println("\nTEST 3: Seller Find All:");
        List<Seller> list1 = sellerDao.findAll();
        for (Seller obj : list1) {
            System.out.println("Objeto: " + obj);
        }

        System.out.println("\nTEST 4: Seller Insert:");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\nTEST 5: Seller Update:");
        seller = sellerDao.findById(1);
        seller.setName("Matha Wayne");
        sellerDao.update(seller);
        System.out.println("Update Completed");

        System.out.println("\nTEST 6: Seller Delet:");
        System.out.print(" Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Complete!");

        sc.close();
    }
}
