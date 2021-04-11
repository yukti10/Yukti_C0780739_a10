package lambton.salesPerson;

import lambton.base.IDisplay;

public abstract class salesPerson implements IDisplay {
    double sales , advance ;

    public salesPerson(double sales, double advance) {
        this.sales = sales;
        this.advance = advance;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public abstract double calculateTotalPay();
}
