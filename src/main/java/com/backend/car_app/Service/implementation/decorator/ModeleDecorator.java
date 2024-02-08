package com.backend.car_app.Service.implementation.decorator;

public class ModeleDecorator extends Decorator{
    private String modele;
    private String infosTechniques;
    public ModeleDecorator(ComposantGraphiqueVehicule composant, String modele) {
        super(composant);
        this.modele = modele;
    }
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Modele : "+modele);
        afficheInfosTechniques();
    }

    public void setInfosTechniques(String infosTechniques) {
        this.infosTechniques = infosTechniques;
    }

    public String getInfosTechniques() {
        return infosTechniques;
    }

    public void afficheInfosTechniques(){
        System.out.println("Informations techniques : "+infosTechniques);
    }

}
