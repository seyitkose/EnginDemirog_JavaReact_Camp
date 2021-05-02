package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		//CLASSLAR 2 ye ayrılır.
		//1- Özellik tutan classlar
		//2- İş yapan classlar(metodlar)

		Product product1 = new Product(1, "Laptop", 10.000, "Macbook M1"); //Referans Oluşturma, İntance
		
//		product1.detail="Macbook M1";
//		product1.id = 1;
//		product1.name = "Laptop";
//		product1.unitPrice = 10.000;
		
		
		//ornegi çoağltıyoruz
		
		//Classlar referans tiptir.
		//Aşağıdaki referanslara karşılık yapmış olduğumuz değişken tanımlarının 
		//hepsi product1.detai, product1.id vb olursa ekrana en son product3 e ait tanımları basar
		//çünkü ramde stack bölge p1,p2,p3 oluşturur fakar array bir referans değişken 
		//tipi olduğu için p1 in karşılığı olan değerler heapte 1 kez tanımlanır.
		//sonrasında sürekli p2 ve p3 e ait değerleri heapte üzerine yazar.
		
		
		Product product2 = new Product(); //new dediğimiz anda heap kısmı oluşur
		
		product2.detail="Macbook M2";
		product2.id = 1;
		product2.name = "Laptop";
		product2.unitPrice = 10.000;
		
		
		Product product3 = new Product(); 
		
		product3.detail="Macbook M3";
		product3.id = 1;
		product3.name = "Laptop";
		product3.unitPrice = 10.000;
		
		
		
				  //products çoğul kullanıyorsak o bir dizidir.İçerisinde ürünler barındırdığını anlarız ona göre yazılımımızı yazabiliriz. 
		Product[] products = {product1, product2, product3}; //süslü parantez içerisine referansımızı yazmasaydık 0 getirirdi. Çünkü dizimizde hiç bir veri yoktu
		System.out.println(products.length);
		
		
		for (Product ornek : products) {
			
			//products: Arrayimizin tanımı
			//product: products arrayimiz içerisinde her döndüğü elemena verdiğimiz takma ad
			//Product: Her elemanımızın veri tipi
			
			
			System.out.println(ornek.detail);
		}
		
		
		//Category classı için referansımızı oluşturuyoruz.
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Ofis Malzemeleri";
		
		
		Category[] categorys = {category1};
		
		for (Category category : categorys) {
		System.out.println(category.name);
		
		}
		
		
		
		
		
		
		//PRODUCTMANAGER CLASSI
		
		//VeriTipi	   //Örnek İsim			//C'tur çalıştırmak için veri tipinden gidiyoruz.
		ProductManager productManager = new ProductManager();
		
		
		//Aşağıdaki gibi istediğim kadar çağırabilirim.
		productManager.adToCart(product1);
		productManager.adToCart(product2);
		productManager.adToCart(product3);
	}

}
