package day23inheritence;

public class Animal {
    /*
    1)eat methodu gibi bir cok class'in kullanmasi gereken methodlari her class'a ayri ayri yazarsak;
        i)tekrar yapmis oluruz, tekrar idael kod icin iyi degil ve olmamali
        ii)her class ayni methodu tekrar tekrar yazmak zaman kaybidir, bu da application in hazirlanma suresini uzattigi icin app pahalilastirir
        iii)tekrar tekrar yazilan method'un tamiri cok zaman alir
        iv)tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir
        v)method'u tekrar tekrar yazmak atomic yapiya terstir
    2)Private class member'lar child class'lar tarafindan kullanilamaz
    public class member lar child class'lar tarafindan kullanilabilir bunda bir problem yok.
    Default class member'lar ayni package de public gibi davrandigi icin child class'lar tarafindan kullanilabilirler
    Protected class member'lar farkli package de de olsalar child class'lar tarafindan kullanilabilir
    3)Java'da bir class'in sadece bir tane parent'i olabilir.Coklu parent'a "multiple inheritance" derler
    tekli parent'a "single inheritence derler". java multiple inheritance'i desteklemez.
    4)Apartman seklindeki inheritance yapisina "multilevel Inheritence" denir. Java multilevel inheritence'i
    destekler.
    5)Java "hierarchical inheritence"'i destekler.

     */
    public void eat(){
        System.out.println("Animals eat..");
    }
    public void drink(){
        System.out.println("Animals drink");
    }
}
