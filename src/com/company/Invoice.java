package com.company;

import java.util.ArrayList;

public class Invoice {

    private ArrayList<String>invoiceItems=new ArrayList<>();
    private ArrayList<String>customerName=new ArrayList<>();
    private ArrayList<Integer>date=new ArrayList<>();
    private ArrayList<Integer>customerAddress=new ArrayList<>();
    private ArrayList<Integer>accountNumber=new ArrayList<>();

    public Invoice(){

    }

    public ArrayList<String> getInvoiceItems() {

        return invoiceItems;
    }

    public void setInvoiceItems(ArrayList<String> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public ArrayList<String> getCustomerName() {
        return customerName;
    }

    public void setCustomerName(ArrayList<String> customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Integer> getDate() {
        return date;
    }

    public void setDate(ArrayList<Integer> date) {
        this.date = date;
    }

    public ArrayList<Integer> getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(ArrayList<Integer> customerAddress) {
        this.customerAddress = customerAddress;
    }

    public ArrayList<Integer> getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(ArrayList<Integer> accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public String toString(){

        return this.invoiceItems +" " +  this.customerName + " " + this.date + " "+this.customerAddress + " "+accountNumber;
    }
}
