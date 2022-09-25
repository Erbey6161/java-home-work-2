
public class Product {
	
	public Product(int ıd) {
		System.out.println("yapıcı blok çalıştı");
		
	}
	public Product() {
		
	}
	
	//Field and Attribute
	private int ıd;
	private String name;
	private String description;
	private double price;
	private int stockAcount;
	private String renk;
	private String kod;
	
	public int getId() {
		return ıd;
	}
	public void setId(int id) {
		this.ıd=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAcount() {
		return stockAcount;
	}
	public void setStockAcount(int stockAcount) {
		this.stockAcount = stockAcount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0,1)+ıd;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	 
	
}
