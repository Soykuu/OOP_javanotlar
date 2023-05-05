public class Main {
    public static void main(String[] args) {
//Insan
        /*Insan ilkInsan = new Insan();
        ilkInsan.konsolaYazdır();*/

//-----------------------------------------------------------------------------------
//Lamba
        /*Lamba salonLambası = new Lamba("Salon");
        //salonLambası.lambaDurumu("Salon");  *konum bilgisini constructor içinde belirttiğimiz için methoddaki parametreleri siliyoruz
        salonLambası.durum = false;
        salonLambası.lambaDurumu();

        Lamba yatakOdaLambası = new Lamba("Yatak Odası");
        System.out.println(yatakOdaLambası.durum);
        yatakOdaLambası.lambaDurumu();*/

//-----------------------------------------------------------------------------------
//Köpek
        Köpek ilkKopegim = new Köpek("Karabas","Golden",10);
        System.out.println("Köpeğimin adı: " + ilkKopegim.getIsim() +
                "\ncinsi: " + ilkKopegim.getCins() +
                "\nyaşı: " + ilkKopegim.getYas());

        ilkKopegim.setIsim("Köpke");
        System.out.println("Köpeğimin yeni adı: " + ilkKopegim.getIsim());

        Köpek ikinciKopegim = new Köpek("Suzy","Golden",5);
        ilkKopegim.sesCıkar(); //abstract method, köpek class'ına extend ettik
        ilkKopegim.uyku(); //public method, tüm class'larda çağırabiliyoruz


        Kedi kedi = new Kedi("Ceku","Tekir",4);
        kedi.sesCıkar(); // polymorphism ile sesCıkar() methodunu kullanarak ayrı çıktılar aldık.
        kedi.uyku();
        kedi.komut(); //kedi sınıfında tanımlı, method'u köpek için kullanamayız.

    }
}