/**
 * Java Proqramlaşdırma — Dərs 08
 * Tapşırıq Vərəqi — Bölmə F: Praktik Tapşırıq
 * Müəllim: Samir Abbasov
 * Xal: 10 / 10
 *
 * TAPŞIRIQ: Ders08Forma — Həndəsi şəkillər iyerarxiyası
 *
 * Şərt:
 *   abstract Forma sinfi:
 *     - String reng sahəsi
 *     - Forma(String reng) konstruktoru
 *     - abstract double saheHesabla() — gövdəsiz
 *     - void melumat() — "reng forma, sahəsi: saheHesabla()" çap edir
 *
 *   Daire extends Forma:
 *     - double radius sahəsi
 *     - Daire(String reng, double radius) konstruktoru
 *     - @Override double saheHesabla() → Math.PI * radius * radius
 *
 *   Düzbucaqlı extends Forma:
 *     - double en, hund sahələri
 *     - Düzbucaqlı(String reng, double en, double hund) konstruktoru
 *     - @Override double saheHesabla() → en * hund
 *
 *   main metodunda:
 *     - Forma[] massivini 2 Daire + 1 Düzbucaqlı ilə doldurun
 *     - for dövründə melumat() çağırın
 *     - instanceof ilə Daire-ləri tapıb radiusunu çap edin
 *
 * Gözlənilən çıxış:
 * -----------------
 *   mavi forma, sahəsi: 78.54
 *   qırmızı forma, sahəsi: 50.27
 *   yaşıl forma, sahəsi: 24.0
 *   Dairənin radiusu: 5.0
 *   Dairənin radiusu: 4.0
 */

// TODO 1: abstract Forma sinifini yazın (String reng, konstruktor, abstract saheHesabla(), melumat())


// TODO 2: Daire sinifini yazın (extends Forma, double radius, @Override saheHesabla())


// TODO 3: Düzbucaqlı sinifini yazın (extends Forma, double en, hund, @Override saheHesabla())


public class Ders08Tapshiriq_PraktikF {

    public static void main(String[] args) {

        // TODO 4: Forma[] massivini yaradın — 2 Daire + 1 Düzbucaqlı
        // Forma[] formalar = {
        //     new Daire("mavi", 5.0),
        //     new Daire("qırmızı", 4.0),
        //     new Düzbucaqlı("yaşıl", 6.0, 4.0)
        // };

        // TODO 5: for dövründə melumat() çağırın


        // TODO 6: instanceof ilə Daire-ləri tapıb radiusunu çap edin

    }

}
