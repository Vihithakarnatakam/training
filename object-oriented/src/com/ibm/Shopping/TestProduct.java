import com.ibm.Shopping.Product;
import com.ibm.Shopping.ShoppingCart;

public class TestProduct {

	public static void main(String[] args) {
		Product p = new Product("book",150);
		Product p1 = new Product("iphone",80000);
		//p.description();
		//p1.description();
		
		ShoppingCart s = new ShoppingCart();
		s.addcart(p);
        s.addcart(p1);
		s.checkout();
        
	}

}
