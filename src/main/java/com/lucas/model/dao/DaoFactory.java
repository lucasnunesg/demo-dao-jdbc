package com.lucas.model.dao;

import com.lucas.db.DB;
import com.lucas.model.dao.impl.DepartmentDaoJDBC;
import com.lucas.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
