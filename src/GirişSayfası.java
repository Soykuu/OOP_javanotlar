public class GirişSayfası implements Sayfa,Menu {
    //Sınıfları Inherit ederken tek ana sayfayı alt sayfalara(class'lara) extend ediyorduk
    //fakat birden fazla Interface'i class'lara implement edebiliyoruz!
    @Override
    public void tusaBas() {
        System.out.println("Tuşa basıldı.");
    }

    @Override
    public void elementBul() {
        System.out.println("Element bulundu.");
    }

    @Override
    public void widget() {

    }
}
