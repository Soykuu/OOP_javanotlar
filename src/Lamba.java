public class Lamba {
    public boolean durum = true; //private dersek oluşturduğumuz objelerde durumu değişteremeyiz!
    private String konum; //constructor'da kullanacağımız değişkeni sınıf seviyesinde tanımladık


    //constructor'lar değişkenlerden sonra methodlardan önce oluşturulur!
    public Lamba(String odaKonumu){
        System.out.println("Yeni nesne oluşturuldu!");
        konum = odaKonumu; //odaKonumu local değişken
        System.out.println("Odanın konumu: " + konum);
    }

    public void lambaDurumu(){
        if(durum){
            System.out.println(" Lamba açık!");
        }else{
            System.out.println(" Lamba kapalı.");
        }
    }
}
