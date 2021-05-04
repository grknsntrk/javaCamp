
public class kurslar {

	public static void main(String[] args) {
		
		Urun urun1 = new Urun("C# gelistirme kampi", "Engin Demiroğ", 100);
		Urun urun2 = new Urun("JAVA gelistirme kampi", "Engin Demiroğ", 20);
		Urun urun3 = new Urun("Kampa Hazırlık", "Engin Demiroğ", 0);
		
		
		Urun[] urunler = {urun1,urun2,urun3};
		
		for(Urun ad : urunler)
			System.out.println("kurs adı : "+ad.name+ " | kurs eğitmeni : "+ ad.teacher+ " | Tamamlama yüzdeniz : "+ ad.completion);
		
		UrunManager urunmanager = new UrunManager();
		
		urunmanager.addtolist(urun1);
		urunmanager.addtolist(urun2);
		urunmanager.addtolist(urun3);

	}

}
