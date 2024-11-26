package com.main;
import com.conn.DBconn;
import com.dao.Empdao;
import com.enity.Emp;
public class insertmain {
    public static void main(String[] args) {
        Emp mp=new Emp();
        mp.setid(7);
        mp.setname("Sharukh");
        mp.setaddr("jaipur");
        mp.setselr("100000");
        
       Empdao ad=new Empdao(DBconn.getconn());
       boolean f= ad.insertdata(mp);
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
