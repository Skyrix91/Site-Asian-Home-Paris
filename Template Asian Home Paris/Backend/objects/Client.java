package objects;

import java.util.Objects;

public class Client {
    
    private String nom;
    private String mail;
    private String tel;

    public Client() {
        super();
    }

    public Client (String name, String mail, String phoneNumber) {
        this.nom = name;
        this.mail = mail;
        this.tel = phoneNumber;
    }
    public void setName(String name) {
        this.tel = name;
    }

    public String getName() {
        return nom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setPhoneNumber(String tel) {
        this.tel = tel;
    }

    public String getPhoneNumber() {
        return tel;
    }

    @Override
    public boolean equals(Object o) {
        //On vérifie si les références d'objets sont identiques
        if (this == o) return true;
        //On s'assure que les objets sont du même type
        if (o == null || getClass() != o.getClass()) return false;
        //Maintenant, on compare les attributs de nos objets
        Client client = (Client) o;
        //
        return Objects.equals(nom, client.nom) && Objects.equals(mail, client.mail) && Objects.equals(tel, client.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, mail, tel);
    }
}
