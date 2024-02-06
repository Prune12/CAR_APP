package com.backend.car_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idcar;
    private String photocar;
    private String modele;
    private String marque;
    private  String anneefabriq;
    private Double prix;
    private String description;
    private String typecarburant;
    private String etat;
    private String localisation;
    private String typeVehicule;

    public Car(){

    }
    public Car(  String photocar,
    String modele,
    String marque,
    String anneefabriq,
    Double prix,
    String description,
    String typecarburant,
    String etat,
    String localisation,
    String typeVehicule

               ){
        this.photocar=photocar;
        this.modele=modele;
        this.marque=marque;
        this.anneefabriq=anneefabriq;
        this.prix=prix;
        this.description=description;
        this.typecarburant=typecarburant;
        this.etat=etat;
        this.localisation=localisation;
        this.typeVehicule=typeVehicule;
    }

    public Long getIdcar() {
        return idcar;
    }

    public void setIdcar(Long idcar) {
        this.idcar = idcar;
    }

    public String getPhotocar() {
        return photocar;
    }

    public void setPhotocar(String photocar) {
        this.photocar = photocar;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getAnneefabriq() {
        return anneefabriq;
    }

    public void setAnneefabriq(String anneefabriq) {
        this.anneefabriq = anneefabriq;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypecarburant() {
        return typecarburant;
    }

    public void setTypecarburant(String typecarburant) {
        this.typecarburant = typecarburant;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public String getTypeVehicule() {
        return typeVehicule;
    }
}
