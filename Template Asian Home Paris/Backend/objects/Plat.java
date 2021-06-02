package objects;

public class Plat {
    private String cat;
    private String nom;
    private int    prix;
    private String ing;
    private String img;

    public Plat (String nom, String cat, String img, String ing, int prix) {
        this.nom = nom;
        this.cat = cat;
        this.img = img;
        this.ing = ing;
        this.prix= prix;
    }
}