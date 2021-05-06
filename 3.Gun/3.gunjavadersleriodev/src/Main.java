public class Main {

	public static void main(String[] args) {
		
			MethodOverloading toplama = new MethodOverloading();

		System.out.println(toplama.topla(3, 2));

		int a = toplama.topla(2, 3, 7);
		System.out.println(a);

		// İnheritance

		BireyselMusteri adnan = new BireyselMusteri();
		adnan.numara = "1574";
		adnan.adi = "Adnan";
		adnan.soyadi = "Karaca";
		
		BireyselMusteri okan = new BireyselMusteri();
		

		KurumsalMusteri banka = new KurumsalMusteri();
		
		banka.numara = "12345";
		banka.sirketadi = "Albaraka";

		MusteriManager yeni = new MusteriManager();
		yeni.add(adnan);
		yeni.add(banka);

		BireyselMusteriManager bireyselyeni = new BireyselMusteriManager();
		
		bireyselyeni.add(okan);
		bireyselyeni.kampanya(adnan);
		
		BankaAnaSayfaUI kredi = new BankaAnaSayfaUI();
		
		kredi.KrediHesapla(new KurumsalMusteriManager());
		kredi.KrediHesapla(new BireyselMusteriManager());
		kredi.KrediHesapla(bireyselyeni);
		kredi.KrediHesapla(new AskerKredisiManager());
		

	}

}
