package com.backend.car_app.Service.implementation.observer;

public abstract class Sujet {
    private Observateur observateur;
    public abstract void ajouterObservateur(Observateur o);
    public abstract void supprimerObservateur(Observateur o);
    public abstract void notifierObservateurs();
}
