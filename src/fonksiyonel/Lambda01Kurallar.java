package fonksiyonel;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.List;

// Javada Lambda fonksiyonları sadece Fonksiyonel interface'ler ile kullanılabilir.
// Sadece bir adet abstract metodu olan interface'lere fonksiyonel interface denilir.
// Kullanıcı isterse kendi fonksiyonel interface'ini yazabilir. Ama Javada hali hazırda
// Consumer, Function, Supplier, Predicate gibi tanımlanmış interfaceler bulunmaktadır.
// Ayrıca bu interface'leri parametre olarak alabilen High Order Function (HOF)'lar da bulunmaktadır.
// foreEach(), map(), filter(), reduce() gibi HOF'lar fonksiyonel interfaceler ile çalıştığı için
// içerisinde Lambda fonksiyonları yazmak mümkündür.
// Javada genelde bu gibi fonksiyonlar üzerinden Lambda ifadeleri kullanılmaktadır.

public class Lambda01Kurallar {

    public static void main(String[] args) {

        List <Integer> list= Arrays.asList(1, 2, 3, 4, 5);

        // forEach() bir collection'nın iterasyonu için kullanılan HOF'dur.
        // Parametre olarak bir lambda fonksiyonu alabilir.

        // Dizinin Elemanlarını yazdıralım
        list.forEach(x -> System.out.print(x+" "));

        System.out.println("\n================================");

        // list'in elemanlarini 2 arttirarak yazdiralim
        list.forEach(x -> System.out.print(x+2+" "));

        System.out.println("\n================================");

        list.forEach(x-> {
            int miktar=2;
            System.out.print(x + miktar +" ");
        });

        System.out.println("\n================================");

        System.out.println("Veri tipi kullanilirsa Explicit");
        list.forEach((Integer x)-> System.out.print(x*2+" "));

        System.out.println("\n================================");

        System.out.println("Bir dis degisken kullanalim");
        int deger=5;
        list.forEach(t-> System.out.print(t+deger+" "));

        //Method referansi ====> Class adi :: Method adi
        System.out.println("\nMethod referansi kullanimi");
        list.forEach(System.out::print);

        System.out.println("\n================================");

        //Method referansi ====> Class adi :: Method adi
        System.out.println("\nMethod referansi kullanimi");
        list.forEach(Lambda01Kurallar::yazdir);

    }

    public static void yazdir(int x) {
        System.out.print(x+" ");
    }
}
