package model;

import java.util.Date;
import javax.persistence.*;

public class Professionnel extends Personne {
    private int idProffessionnel;
    private String nationalite;
    private String marieAvecQui;
    private String photo;

    public Professionnel() {
    }

    public Professionnel(String nom, String prenom, Date dateNaissance, String nationalite, String marieAvecQui, String photo) {
        super(nom, prenom, dateNaissance);
        this.nationalite = nationalite;
        this.marieAvecQui = marieAvecQui;
        this.photo = photo;
    }

    public int getIdProffessionnel() {
        return idProffessionnel;
    }

    public void setIdProffessionnel(int idProffessionnel) {
        this.idProffessionnel = idProffessionnel;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getMarieAvecQui() {
        return marieAvecQui;
    }

    public void setMarieAvecQui(String marieAvecQui) {
        this.marieAvecQui = marieAvecQui;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
