package com.main;
import com.conn.DBconn;
import com.dao.Empdao;
import com.enity.Emp;

public class update {
    public static void main(String[] args) {
        Emp mp=new Emp();
        mp.setid(6);
        mp.setname("ss");
        mp.setaddr("todabhim");
        mp.setselr("sss");
        
       Empdao ad=new Empdao(DBconn.getconn());
       boolean f= ad.update(mp);
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
