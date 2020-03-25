public class Runner {
    public static void main(String[] args) throws InterruptedException{
        Shuttle belka = new Shuttle();
        SpaceX strelka = new SpaceX();
        Cosmodrom cosmo = new Cosmodrom();
        cosmo.launch(belka);
        cosmo.launch(strelka);

    }
}
