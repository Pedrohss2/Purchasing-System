
# Purchasing-System

Project made with JAVA using OOP. The project is to represent a simple system of imported, used products and a common product.




## Methods

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
priceTag() returns the description of the product, in the example above it is overriding a main method that is in the Product class, note that this method is final, this means that it cannot be overwritten.

.



