package model;

import javax.persistence.*;
import java.util.Date;

public class Media {
    private String titre;
    private int duree;
    private Date dateSortie;
    private String nationalite;
    private String affiches;
    private int ageMinimum;
    private String resume;
    private String bandeAnnonce;
    private int nombreVue;

    public Media() {
    }

    public Media(String titre, int duree, Date dateSortie, String nationalite, String affiches, int ageMinimum, String resume, String bandeAnnonce, int nombreVue) {
        this.titre = titre;
        this.duree = duree;
        this.dateSortie = dateSortie;
        this.nationalite = nationalite;
        this.affiches = affiches;
        this.ageMinimum = ageMinimum;
        this.resume = resume;
        this.bandeAnnonce = bandeAnnonce;
        this.nombreVue = nombreVue;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getAffiches() {
        return affiches;
    }

    public void setAffiches(String affiches) {
        this.affiches = affiches;
    }

    public int getAgeMinimum() {
        return ageMinimum;
    }

    public void setAgeMinimum(int ageMinimum) {
        this.ageMinimum = ageMinimum;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getBandeAnnonce() {
        return bandeAnnonce;
    }

    public void setBandeAnnonce(String bandeAnnonce) {
        this.bandeAnnonce = bandeAnnonce;
    }

    public int getNombreVue() {
        return nombreVue;
    }

    public void setNombreVue(int nombreVue) {
        this.nombreVue = nombreVue;
    }
}
