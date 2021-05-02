package ders2_odev1;


public class Education {

	public Education(String rowNumber, String name, String description, String instructor,
			String price) {
		this.rowNumber = rowNumber;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
		this.price = price;
		
	}
	
	
	public Education(int id, String educationName, String educationDescription, String educationInstructor,
			String educationPrice) {

		this.id = id;
		this.educationName = educationName;
		this.educationDescription = educationDescription;
		this.educationInstructor = educationInstructor;
		this.educationPrice = educationPrice;

	}

	// Kurslar diye bir alan var. Tıkladığımızda;
	// ÖZELLİK CLASSI
	// 3 farklı kursun "Adı, Açıklama Alanı, Eğitmeni, Ücretli/Ücretsiz Kısmı"
	// bulunmakta.

	// İŞ CLASSI
	// Programa Dahil Ol Butonu

	
	String rowNumber;
	String name;
	String description;
	String instructor;
	String price;

	int id;
	String educationName;
	String educationDescription;
	String educationInstructor;
	String educationPrice;

}
