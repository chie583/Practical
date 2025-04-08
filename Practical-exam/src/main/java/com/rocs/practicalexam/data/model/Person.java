package com.rocs.practicalexam.data.model;

public class Person {


    private int itemid;
    private String itemdesc;
    private int unitprice;
    private int qty;
    private String customer;
    private String address;
    private int contactnumber;
    private int transactionnumber;
    private int transdate;


    public person(int itemid, String itemdesc, int unitprice, int qty, String customer, String address, int contactnumber, int transactionnumber, int transdate){
        this.itemid = itemid;
        this.itemdesc = itemdesc;
        this.unitprice = unitprice;
        this.qty = qty;
        this.customer = customer;
        this.address = address;
        this.contactnumber = contactnumber;
        this.transactionnumber = transactionnumber;
        this.transdate = transdate;
    }
    public person() {

    }

    public int getItemid(){
        return itemid;
    }

    public String getItemdesc(){
        return itemdesc;
    }

    public int getUnitprice(){
        return unitprice;
    }

    public int getQty(){
        return qty;
    }

    public String getCustomer(){
        return customer;
    }

    public String getAddress(){
        return address;
    }

    public int getContactnumber(){
        return contactnumber;
    }

    public int getTransactionnumber(){
        return transactionnumber;
    }

    public int getTransdate(){
        return transdate;
    }
}