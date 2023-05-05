abstract class Hayvan {

    protected String isim; //protected anahtar kelimesi ile değişkene hem bu sınıftan hem de alt sınıflardan erişim sağlanabilir
    private String cins;
    private int yas;

    public Hayvan(String isim, String cins, int yas){
        this.isim=isim;
        this.cins=cins;
        this.yas=yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String yeniIsim) {
        this.isim = yeniIsim;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    abstract void sesCıkar(); //bu methodu extends ile diğer classlara inherit etmek gerekiyor

    public void uyku(){  //bu method public oluşturduk, yani inheritance kullanmadan bu classtaki methodu mainde çağırabiliriz.
        System.out.println("Hayvan uyuyor.");
    }
}
