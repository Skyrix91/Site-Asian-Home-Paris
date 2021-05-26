package objects;

import java.util.Objects;

public class Client {
    
    private String name;
    private String mail;
    private String phoneNumber;

    public Client() {
        super();
    }

    public Client (String name, String mail, String phoneNumber) {
        this.name = name;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        //On vérifie si les références d'objets sont identiques
        if (this == o) return true;
        //On s'assure que les objets sont du même type
        if (o == null || getClass() != o.getClass()) return false;
        //Maintenant, on compare les attributs de nos objets
        Client client = (Client) o;

        return Objects.equals(name, client.name) && Objects.equals(mail, client.mail) && Objects.equals(phoneNumber, client.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mail, phoneNumber);
    }
}
