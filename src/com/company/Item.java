package com.company;

public class Item {
    private String name;
    private double price;
    private int quantity;
    private boolean isTaxable;

    double subtotal, total, salesTax;

    public Item(){

    }
    public Item(String name,double price,int quantity,boolean isTaxable){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.isTaxable=false;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public double getEachItemCost(){
        return price*quantity;
    }
    public double getSubTotal(){
        double subtotal=0;
        for(int i=0;i<=quantity;i++){

        }
        return subtotal;
    }
    public double getTotal(){
      if (isTaxable=true) {
           total = subtotal + salesTax;
      }else
          return total=subtotal;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isTaxable() {

        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
    }
    @Override
    public String toString(){

        return this.name +" " +  this.price + " " + this.quantity + " "+ this.isTaxable+ ""+getEachItemCost()+""+getSubTotal()+""+getTotal();
    }
}
