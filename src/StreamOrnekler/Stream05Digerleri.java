package StreamOrnekler;

import java.util.List;
import java.util.stream.*;

public class Stream05Digerleri {
    public static void main(String[] args) {
        // 1'den belirtilen değere kadar olan tamsayıları toplayan ve sonucu döndüren metodu yazınız.
        System.out.println("TOPLAM: "+ topla(4));
        System.out.println("TOPLAM: "+ topla2(4)+"(Verilen sinir dahil)");
        System.out.println("Tek Sayilarin Toplami: "+tekSayilariTopla(1,20));
        System.out.println("Faktoriyel: " + IntFaktoriyel(5));
        System.out.println("Faktoriyel: " + longFaktoriyel(20));
        System.out.println("Faktoriyel: " + dounleFaktoriyel(20));
        System.out.println("50'den Büyük Olan Notlar: "+doubleDiziyiListeCevir());
    }
    public static int topla(int deger){
        return IntStream.range(1,deger).sum();
    }
    public static int topla2(int deger){
        return IntStream.rangeClosed(1,deger).sum();
    }
    public static int tekSayilariTopla(int ilk, int son){
        return IntStream.rangeClosed(ilk,son).filter(t-> t%2==1).sum();
    }
    public static Integer IntFaktoriyel(int n){
        return IntStream.rangeClosed(1,n).reduce(1,(x, y)->x*y);
    }
    public static Long longFaktoriyel(int n){
        return LongStream.rangeClosed(1,n).reduce(1,(x, y)->x*y);
    }
    public static Double dounleFaktoriyel(int n){
        return DoubleStream.iterate(1, x-> x+1).limit(n).reduce(1,(x,y)->x*y);
    }
    // Bir double diziyi (notlar) Stream nesnesine dönüştürerek bu dizi içerisinde bulunan
    // sayıların 50 den büyük olanlarını ayrı bir listeye kaydererek yazdıran metodu tanımlayınız
    public static List<Double> doubleDiziyiListeCevir(){
        Double [] notlar={88.5, 52.3, 88.9, 100.0, 99.6, 42.0, 10.0};
        Stream<Double> streamNotlar=Stream.of(notlar);
        return streamNotlar.filter(t->t>50.0).collect(Collectors.toList());
    }
}
