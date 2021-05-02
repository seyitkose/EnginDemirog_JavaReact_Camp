package ders2_odev1;

public class Main {

	public static void main(String[] args) {

		
		Education education1 = new Education("SIRA NO", "EĞİTİM ADI", "AÇIKLAMA", "EĞİTMEN", "EĞİTİM ÜCRETİ");
		
		
		
		// JAVA

		Education educations2 = new Education(1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
				"Engin Demirog", "Ücretsiz");

		// C#

		Education educations3 = new Education(2, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
				"2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.",
				"Engin Demirog", "Ücretsiz");

		// #BASIC PROGRAMMING

		Education educations4 = new Education(3, "Programlamaya Giriş İçin Temel Kurs",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.",
				"Engin Demirog", "Ücretsiz");
		
		
		//Eğitim Kolon Başlıkları
		System.out.println(education1.rowNumber + " - " + education1.name  + " - " + education1.description + " - " + education1.instructor + " - " + education1.price);
		
		Education[] educations = {educations2, educations3, educations4};
		


		
		for (Education education : educations) {
			
			//Eğitimler
			System.out.println(education.id + " - " + education.educationName + " - " + education.educationDescription + " - " + education.educationInstructor + " - " + education.educationPrice);
			
		}
		
		
		EducationManager educationManger = new EducationManager();
		
		educationManger.adToCart(educations2);
	}

}
