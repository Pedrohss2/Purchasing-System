
# Purchasing-System

Projeto feito com JAVA ultilizando POO.
O projeto é para representar um sistema simples de produtos importados, usados e um porduto commum.



## Metodos
```JAVA
   public Double totalPrice() {
        return getPrice() + customsFee;
    }

     @Override
    public final String priceTag() {
        return getName() +
                String.format(" $ %.2f (taxa alfandegária:$ %.2f)"
                , totalPrice(), customsFee);
    }
```
In the 'totalPrice()' method that is used on the imported product, the price of the product plus the customs fee is returned.
priceTag() returns the description of the product, in the example above it is overriding a main method that is in the Product class.



