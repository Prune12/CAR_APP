package com.backend.car_app.Service;

import com.backend.car_app.models.Client;
import com.backend.car_app.models.Vendor;
import com.backend.car_app.repository.ClientRepository;
import com.backend.car_app.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
    @Autowired
    VendorRepository vendorrepo;

    //fonction permettant de d'ajouter un client
    public Vendor createvendor(String name,
                               String surname,
                               String password,
                               String email,
                               String username,
                               Long tel){
        Vendor clt=new Vendor();
        clt.setName(name);
        clt.setSurname(surname);
        clt.setPassword(password);
        clt.setEmail(email);
        clt.setUsername(username);
        clt.setTel(tel);
        vendorrepo.save(clt);
        return clt;
    }
    //fonction permettant la connexion d'un client
    public Vendor loginvendor(String email,String password){
        Vendor utilisateur= vendorrepo.findByEmail(email);
        if (utilisateur!= null && utilisateur.getEmail().equals(email) && utilisateur.getPassword().equals(password)){
            return utilisateur;
        }
        else {
            return null;
        }
    }
}
