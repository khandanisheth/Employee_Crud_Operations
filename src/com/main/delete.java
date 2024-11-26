package com.main;

import com.conn.DBconn;
import com.dao.Empdao;
import com.enity.Emp;

public class delete {
     public static void main(String[] args) {
        Emp mp=new Emp();
        mp.setid(2);
       Empdao ad=new Empdao(DBconn.getconn());
       boolean f= ad.Delete(mp);
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
