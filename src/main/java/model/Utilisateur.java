package model;

import java.util.Date;

import org.mindrot.jbcrypt.BCrypt;
import javax.persistence.*;

@Entity

public class Utilisateur extends Personne {
    @Id
    @GeneratedValue
    private int id;
    private String mail;
    private String type;
    private String hashMotDePasse;
    private String login;
    private Utilisateur bloquePar;

    public Utilisateur(int id, String nom, String prenom, Date dateNaissance, String mail, String type, String motDePasse, String login) {
        super(nom, prenom, dateNaissance);
        this.mail = mail;
        this.type = type;
        this.hashMotDePasse = hashMotDePasse(motDePasse);
        this.login = login;
    }

    private String hashMotDePasse(String motDePasse) {
        String hashed = BCrypt.hashpw(motDePasse, BCrypt.gensalt(12));
        return hashed;
    }

    public static String testMyPass(String motDePasse, String hashed) {
        if (BCrypt.checkpw(motDePasse, hashed))
            return "It matches " + hashed;
        else
            return "It does not match";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHashMotDePasse() {
        return hashMotDePasse;
    }

    public void setHashMotDePasse(String hashMotDePasse) {
        this.hashMotDePasse = hashMotDePasse;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Utilisateur getBloquePar() {
        return bloquePar;
    }

    public void setBloquePar(Utilisateur bloquePar) {
        this.bloquePar = bloquePar;
    }
}
