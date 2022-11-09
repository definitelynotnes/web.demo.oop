package generics.demo1a;

import java.util.ArrayList;
import java.util.List;

public class ProductList<T extends Product> {
    
    // cannot create static reference to generics.
    private List<T> products;
    
    public ProductList() {
        products = new ArrayList<>();
    }
    
    public void add(T product) {
        if(product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        products.add(product);
    }
    
    public List<T> getProducts(){
        return products;
    }
    
    public int count() {
        return products.size();
    }
    
    public static void main(String[] args) {
        ProductList<DiscountedProduct> discountedProducts = new ProductList<>();
        discountedProducts.add(new DiscountedProduct());
        discountedProducts.add(new DiscountedProduct());
        discountedProducts.add(new DiscountedProduct());
        System.out.println("Discounted product count: " + discountedProducts.count());
        
        ProductList<RegularProduct> regularProducts = new ProductList<>();
        regularProducts.add(new RegularProduct());
        regularProducts.add(new RegularProduct());
        regularProducts.add(new RegularProduct());
        System.out.println("Regular product count: " + regularProducts.count());
    }
}
