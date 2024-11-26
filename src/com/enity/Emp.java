package com.enity;
public class Emp {
    private int id;
    private String name;
    private String addresh;
    private String selery;
    public Emp()
    {
        super();
    }
    
    //getter and setter id
    public void setid(int id)
    {
        this.id=id;
    }
    public int getid()
    {
        return id;
    }
    
    //getter and setter name
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    
    //getter and setter addresh
    public void setaddr(String addresh)
    {
        this.addresh=addresh;
    }
    public String getaddr()
    {
        return addresh;
    }
    
     //getter and setter selery
    public void setselr(String selery)
    {
        this.selery=selery;
    }
    public String getselr()
    {
        return selery;
    }
}
