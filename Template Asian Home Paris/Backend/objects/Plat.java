package objects;

public class Plat {
    private String id;
    private String nom;
    private int prix;
    private String ing;
    private String catégorie;
    private String img;

    public Plat(String nom, String catégorie, String img, String ing, int prix, String id) {
        this.nom = nom;
        this.catégorie = catégorie;
        this.img = img;
        this.ing = ing;
        this.prix = prix;
        this.id = id;
    }
}