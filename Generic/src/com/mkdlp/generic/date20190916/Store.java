package com.mkdlp.generic.date20190916;

import com.mkdlp.generic.util.Generator;
import com.mkdlp.generic.util.Generators;

import java.util.ArrayList;
import java.util.Random;

class Product{

    private final int id;

    private String description;

    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public void priceChange(double change){
        price+=change;
    }

    public static Generator<Product> generator=
        new Generator<Product>() {
        private Random radom=new Random(47);
            @Override
            public Product next() {
                return new Product(radom.nextInt(1000),"Test",Math.round(radom.nextDouble()*1000+0.99));
            }
        };
}

class Shelf extends ArrayList<Product> {
    public  Shelf(int nProducts){
        Generators.fill(this,Product.generator,nProducts);
    }
}

class Aisle extends ArrayList<Shelf>{
    public Aisle(int nShelfs,int nProduct){
        for(int i=0;i<nShelfs;i++){
            add(new Shelf(nProduct));
        }
    }
}

class checkoutStand{}
class Office{}

public class Store extends ArrayList<Aisle>{
    private ArrayList<checkoutStand> checkouts=new ArrayList<>();
    private Office office=new Office();
    public Store(int nAsiles,int nShelfs,int nProducts){
        for(int i=0;i<nAsiles;i++){
            add(new Aisle(nShelfs,nProducts));
        }
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(Aisle a:this){
            for(Shelf s:a){
                for(Product p:s){
                    sb.append(p);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14,5,10));
    }
}