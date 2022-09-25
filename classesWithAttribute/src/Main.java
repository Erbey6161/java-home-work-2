
public class Main {
	public static void main(String[] args) {
		
	
	Product product = new Product();
	product.setName("Laptop");
	product.setId(1);
	product.setDescription("Asus Laptop");
	product.setPrice(5000);
	product.setStockAcount(3); 
	
	ProductManager manager = new ProductManager();
	manager.Add(product);
	System.out.println(product.getKod());
	

	}
}
