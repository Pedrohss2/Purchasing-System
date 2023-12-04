package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<Product> products = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int numberOfProduct = sc.nextInt();


        for (int i = 1; i <= numberOfProduct; i++) {
            System.out.printf("Product #%d data:", i);
            System.out.println();
            System.out.println("Common, used or imported (c/d/i)? ");
            sc.nextLine();
            char test = sc.next().charAt(0);

            System.out.println("Name: ");
            String nameOfProduct = sc.next();

            System.out.println("Price: ");
            Double priceOfProduct = sc.nextDouble();


            if(test == 'i') {
                System.out.println("Customs fee: ");
                Double customFee = sc.nextDouble();
                products.add(new ImportedProduct(nameOfProduct, priceOfProduct, customFee));
            }
            if(test == 'c') {
                products.add(new Product(nameOfProduct, priceOfProduct));
            }
            else if (test == 'u') {
                System.out.println("Manufacture date: ");
                Date date = simpleDateFormat.parse(sc.next());
                products.add(new UsedProduct(nameOfProduct, priceOfProduct, date));
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
        sc.close();

    }
}
