package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.enity.Emp;
import java.sql.ResultSet;
public class Empdao {
    
   private Connection con;
   public Empdao(Connection con)
   {
       this.con=con;
   }
   PreparedStatement ps;
   public boolean insertdata(Emp emp)
   {
       boolean f=false;
       try 
       {
           ps=con.prepareStatement("insert into empdata values(?,?,?,?)");
           ps.setInt(1, emp.getid());
           ps.setString(2, emp.getname());
           ps.setString(3, emp.getaddr());
           ps.setString(4, emp.getselr());
           
           int a=ps.executeUpdate();
           if(a==1)
           {
               f=true;
           }  
       } 
       catch (Exception e)
       {
           System.out.println(e);
       }
       return f;
   }
   
   public boolean update(Emp emp)
   {
       boolean f=false;
       try 
       {
            ps=con.prepareStatement("update empdata set name=?,addresh=?,selery=? where id=?");
            
            ps.setString(1, emp.getname());
            ps.setString(2, emp.getaddr());
            ps.setString(3, emp.getselr());
            ps.setInt(4, emp.getid());           
            int a=ps.executeUpdate();
            
            if(a==1)
            {
               f=true;
            }  
       } 
       catch (Exception e)
       {
           System.out.println(e);
       }
       return f;
       
   }
   
    public boolean Delete(Emp emp)
   {
       boolean f=false;
       try 
       {
            ps=con.prepareStatement("Delete from empdata where id=?");
            ps.setInt(1, emp.getid());           
            int a=ps.executeUpdate();
            
            if(a==1)
            {
               f=true;
            }  
       } 
       catch (Exception e)
       {
           System.out.println(e);
       }
       return f;
       
   }
    
   public boolean Fatch(Emp emp)
   {
       boolean f=false;
       try 
       {
            ps=con.prepareStatement("select * from empdata");
            ResultSet rs=ps.executeQuery();        
            while (rs.next()) 
            {
                System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
            }
       } 
       catch (Exception e)
       {
           System.out.println(e);
       }
       return f;   
   }
    
}
