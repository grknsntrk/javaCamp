
public class kurslar {

	public static void main(String[] args) {
		
		Urun urun1 = new Urun("C# gelistirme kampi", "Engin Demiro�", 100);
		Urun urun2 = new Urun("JAVA gelistirme kampi", "Engin Demiro�", 20);
		Urun urun3 = new Urun("Kampa Haz�rl�k", "Engin Demiro�", 0);
		
		
		Urun[] urunler = {urun1,urun2,urun3};
		
		for(Urun ad : urunler)
			System.out.println("kurs ad� : "+ad.name+ " | kurs e�itmeni : "+ ad.teacher+ " | Tamamlama y�zdeniz : "+ ad.completion);
		
		UrunManager urunmanager = new UrunManager();
		
		urunmanager.addtolist(urun1);
		urunmanager.addtolist(urun2);
		urunmanager.addtolist(urun3);

	}

}
