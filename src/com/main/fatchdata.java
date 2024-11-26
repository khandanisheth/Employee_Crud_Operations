package com.main;

import com.conn.DBconn;
import com.dao.Empdao;
import com.enity.Emp;

public class fatchdata {
    public static void main(String[] args) {
       Emp mp=new Emp();
       Empdao ad=new Empdao(DBconn.getconn());
       boolean f= ad.Fatch(mp);
       if(f)
       {
           System.out.println("TRue SuccessFully");
       }
       else
       {
           System.out.println("UnSuccessFully");
       }
    }
}
