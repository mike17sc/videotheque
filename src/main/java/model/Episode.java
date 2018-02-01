package model;

import java.util.Date;
import javax.persistence.*;

public class Episode {
    private String titre;
    private int numero;
    private String resume;
    private int duree;
    private Date dateSortie;
    private int nombreVue;
    public Episode() {
    }
    public Episode(String titre, int numero, String resume, int duree, Date dateSortie, int nombreVue) {
        this.titre = titre;
        this.numero = numero;
        this.resume = resume;
        this.duree = duree;
        this.dateSortie = dateSortie;
        this.nombreVue = nombreVue;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
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

    public int getNombreVue() {
        return nombreVue;
    }

    public void setNombreVue(int nombreVue) {
        this.nombreVue = nombreVue;
    }
}
