package com.lucas.application;

import com.lucas.model.dao.DaoFactory;
import com.lucas.model.dao.SellerDao;
import com.lucas.model.entities.Department;
import com.lucas.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TEST 1: Seller Find By Id:");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
