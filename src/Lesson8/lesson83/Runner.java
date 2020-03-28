import boot.Nike;
import jacket.NorthFace;
import pant.Adidas;

public class Runner {
    public static void main(String[] args) {
        Man youngMan = new Man("Серега", new Adidas(), new NorthFace(), new Nike());
        youngMan.putOnClothes();
        youngMan.putOffClothes();
    }
}
