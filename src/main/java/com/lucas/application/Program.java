package com.lucas.application;

import com.lucas.model.dao.DaoFactory;
import com.lucas.model.dao.SellerDao;
import com.lucas.model.entities.Department;
import com.lucas.model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TEST 1: Seller Find By Id:");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\nTEST 2: Seller Find By Department:");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println("Objeto: " + obj);
        }

        System.out.println("\nTEST 3: Seller Find All:");
        List<Seller> list1 = sellerDao.findAll();
        for (Seller obj : list1) {
            System.out.println("Objeto: " + obj);
        }
        /*
        Boolean equalTest = list.get(0).getDepartment() == list.get(1).getDepartment();
        System.out.println("Initial Department identityHashCode: " + System.identityHashCode(department));
        System.out.println("== Test: " + equalTest);
        System.out.println("Equals() Test: " + list.get(0).getDepartment().equals(list.get(1).getDepartment()));
        System.out.println("HashCode() obj1: " + System.identityHashCode(list.get(0).getDepartment()));
        System.out.println("HashCode() obj2: " + System.identityHashCode(list.get(1).getDepartment()));
        */
    }
}
