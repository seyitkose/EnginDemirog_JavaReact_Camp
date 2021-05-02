package oopIntro;

public class ProductManager {
	//Biz şimdiye kadar özellik tutan classlarla çalışmıştık, şimdi işi yapan(metod tutucu) classlar ile çalışacağız.
	//Aşağıdaki örnekte sepete ekle butonuna tıkladığımızda arka planda neler oluyor onu inceleyeceğiz. 
	
	//Yazılım geliştirmeden SOLID prensibi vardır. 
	//S: her class her metod bir işi yapmakla görevlidir. Product classımız özellik tutuyordu örneğin. 
	
	
	
	/*Ürünlerle ilgili olanları bu classın altında metod olarak oluşturuyoruz. Bu şekilde 
	 birbiriyle ilişkili olanları class haline getiriyoruz.
	bu classı main de kullanacağız. */
	
	
//Bir işi yapan sınıfın metodu nasıl yazılır ?
	
	
	
	
	public void adToCart(Product dene) { //adToCart bizim verdiğimiz bir isim. Cart:Sepet demek.
		System.out.println("Sepete Eklenen Ürün: "+dene.id);
	}
	
	
	
	
	
	//BURADA YAPMIŞ OLDUĞUMUZ İŞLEM
	
	/*     
	 * Product classına ait ürün oluşturmak için main classında referans yaratarak değişkenlerimizi tanımlamıştık.
	 * Sonrasında bu ürünleri ProductManager classımız içerisinde oluşturduğumuz adToCart metodumuza eklemek için
	 * metodumuz içerisindeki parantez içerisine Product classımızı çağırıyoruz ve ekrana yazdırma vb. 
	 * işlemlerimizde kullanabilmek için yanına takma bir ad yazıyoruz. (Prouct product)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
}
