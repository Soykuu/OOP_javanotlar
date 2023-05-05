public class Köpek extends Hayvan {

    public Köpek(String isim, String cins, int yas) { //Super anahtar kelimesi kullanarak Köpek sınıfındaki constructor'daki değerleri Hayvan ana sınıfındaki değerlere ulaşarak kullanabiliyoruz.
        super(isim, cins, yas);
    }

    @Override
    void sesCıkar() {
        System.out.println("Hav hav!");
    }

    @Override // Bu classta yazdığımız uyku() methodu, Hayvan süper sınıfındakı uyku() methodunu geçersiz kılıyor.
              // Bunu belirtmek için bu annotation'ı yazıyoruz
    public void uyku(){
        System.out.println("Köpek uyurken horluyor!");
    }
}
