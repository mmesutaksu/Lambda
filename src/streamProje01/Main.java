package streamProje01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<Ogrenci> ogrListesi= new ArrayList<>();

    public static void main(String[] args) {

        testOgrenciOlustur();
        System.out.println("Isme göre Liste");
        ismeGöreListele("ahmet");
        System.out.println("\nSoyad'a göre Liste");
        soyIsmeGoreListele("Can");
        System.out.println("\nCinsiyet'e göre Liste");
        cinsiyeteGoreListele("Kadin");
        System.out.println("\nNotlar'a göre Liste");
        notaGoreSirala(95.5);
        System.out.println("\nYas'a göre Liste");
        yasaGoreSirala(40);
        //sinifOrtalamasiHesapla();

    }
    private static void yasaGoreSirala(int yas) {
        ogrListesi.stream().filter(t-> t.getYas()==yas).forEach(System.out::println);
    }

    private static void notaGoreSirala(double diplomaNotu) {
        ogrListesi.stream().filter(t -> t.getDiplomaNotu() == diplomaNotu).forEach(System.out::println);
    }

    private static void cinsiyeteGoreListele(String cinsiyet) {
        ogrListesi.stream().filter(t->t.getCinsiyet().equalsIgnoreCase(cinsiyet)).forEach(System.out::println);
    }

    private static void soyIsmeGoreListele(String soyisim) {
        ogrListesi.stream().filter(t->t.getSoyAd().equalsIgnoreCase(soyisim)).forEach(System.out::println);
    }

    private static void ismeGöreListele(String isim) {
        ogrListesi.stream().filter(t->t.getAd().equalsIgnoreCase(isim)).forEach(System.out::println);
    }

    private static void testOgrenciOlustur() {
        ogrListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "Erkek"));
        ogrListesi.add(new Ogrenci("Ahmet", "Baki", 18, 90.1, "Erkek"));
        ogrListesi.add(new Ogrenci("Ayşe", "Can", 21, 82.3, "Kadin"));
        ogrListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "Erkek"));
        ogrListesi.add(new Ogrenci("Ayşe", "Yılmaz", 40, 45, "Kadin"));
        ogrListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "Erkek"));
        ogrListesi.add(new Ogrenci("Veli", "Öztürk", 20, 95.5, "Erkek"));
    }
}
