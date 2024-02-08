package com.backend.car_app.Service.implementation.decorator;

public class MarqueDecorator extends Decorator{

    private String logo;

    public MarqueDecorator(ComposantGraphiqueVehicule composant) {
        super(composant);
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Logo : "+logo);
        afficheLogo();
    }

    public void afficheLogo(){
        System.out.println("Logo : "+logo);
    }
    
}
