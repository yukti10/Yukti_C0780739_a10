package lambton.salesPerson;

import lambton.utils.Currencyconvertor;

public class CommissionRate extends salesPerson {
    double rate;
    double pay;
    public CommissionRate(double sales, double advance) {
        super(sales, advance);
        this.rate = rate;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateTotalPay() {
        setPay((this.sales * getRate())- this.advance);
        return getPay();
    }

    @Override
    public void display() {
        if  (this.sales<10000){
            setRate(0.5);
        }
        else if (this.sales>=10000 &&  this.sales<14999 ){
            setRate(0.10);
        }
        else if (this.sales>=15000 &&  this.sales<17999 ){
            setRate(0.12);
        }
        else if (this.sales>=18000 &&  this.sales<21999 ){
            setRate(0.15);
        }
        else if (this.sales>=22000){
            setRate(0.16);
        }
        System.out.println("Total Commission: "+ Currencyconvertor.currencyFormat(calculateTotalPay()+this.advance));
        System.out.println("Final Commission(after deducting advance pay): "+Currencyconvertor.currencyFormat(calculateTotalPay()));
        if (getPay()<0){
            setPay(-(this.pay));
            System.out.println("The sales person must reimburse "+Currencyconvertor.currencyFormat(getPay())+" back ");
        }
    }
}
