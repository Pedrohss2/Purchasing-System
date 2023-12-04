package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends  Product {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Date minutosFactureDate;

    public UsedProduct(String name, Double price, Date minutosFactureDate) {
        super(name, price);
        this.minutosFactureDate = minutosFactureDate;
    }

    public Date getMinutosFactureDate() {
        return minutosFactureDate;
    }

    public void setMinutosFactureDate(Date minutosFactureDate) {
        this.minutosFactureDate = minutosFactureDate;
    }


    @Override
    public  String priceTag() {
        return getName() + " (used) " +
                "$ " + getPrice() + " (Manufacture date: ) " + simpleDateFormat.format(minutosFactureDate);

    }

}
