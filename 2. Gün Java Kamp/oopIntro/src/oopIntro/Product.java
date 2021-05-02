package oopIntro;

public class Product {
	//Product veri tipim var onun içerisinde name diye bir alan var.
	
	
	
	//2- Constructor Tanımlama
	
		public Product() {
			System.out.println("Ben Çalıştım"); //maindeki aşağıdakiler için  çalışır ve aşağıdakiler içeriğini ezerek ekrana ben çalıştım yazar.
			
			
			
//			Product product2 = new Product(); //new dediğimiz anda heap kısmı oluşur
//			
//			product2.detail="Macbook M2";
//			product2.id = 1;
//			product2.name = "Laptop";
//			product2.unitPrice = 10.000;
//			
//			
//			Product product3 = new Product(); 
//			
//			product3.detail="Macbook M3";
//			product3.id = 1;
//			product3.name = "Laptop";
//			product3.unitPrice = 10.000;
		}
		
	
		//alttaki tanım metottur (constructor)
		public Product(int id, String name, double unitPrice, String detail) {
			//Burada eşitliğin sağ tarafındakiler(id,name,unitPrice, detail) bir üstteki constructor a ait)
			// eşitliğin solundaki (id,name,unitPrice, detail) Product classı içerisindeki değişken tanımlarına ait. 
			
			//this: classtaki demek, this.id: classtaki id
			
			this(); // default olan contructor ı başka bir constructor içerisinde de tanımlayabiliriz. Çalışabilmesi için En üstte yazmalıyız. Artık 3 kez ekrana ben çalıştım yazar.
			this.id =id;
			this.name = name;
			this.unitPrice=unitPrice;
			this.detail = detail;
			
		}
	
	
	//Aşağıdaki gibi değişkenlerimizi tanımlıyoruz. En başta sadece bu kısım vardı. 2 yazandan itibaren Constructorla birşleştirdik.
	//Constructor da tanımladığımızda artık aşağıdakiler Product classına ait oluyor
	//Main classında dışarıdan product1. şeklinde yazarak eriştiğimiz alan aşağıdaki alan
	
		//Main classında parantez içerisine aşağıdaki gibi bir ekleme yaptık
		//Product product1 = new Product(1, "Macbook M1", 10.000, "Laptop"); Buradaki değerleri aşağıdaki değişkenlere atayabilmemiz için constructordaki parantez içinde aşağıdaki değişkenlerin karşılığı ile eşitlememiz gerekiyor. 
		//Yani yukarıdaki parantez içindekiler önce constructor içindeki parantez içerisine gönderilir. Oradaki constructor içerisinde de biz this. ile eşitlik yaparak
		//değerleri aşağıdaki değişkenlere atarız.
		
		
	int id; 
	String name;
	double unitPrice;
	String detail;

	
	
	
	
	
	
	
}
