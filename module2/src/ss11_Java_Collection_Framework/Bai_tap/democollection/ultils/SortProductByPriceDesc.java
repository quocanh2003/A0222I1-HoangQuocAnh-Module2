package Bai_tap.democollection.ultils;

import ss11_Java_Collection_Framework.Bai_tap.democollection.entity.Product;

import java.util.Comparator;

public class SortProductByPriceDesc implements Comparator<Product> {


    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getPrice() == p2.getPrice()){
            return p1.getName().compareTo(p2.getName());
        }
        return (int) (p2.getPrice() - p1.getPrice());
    }

}
