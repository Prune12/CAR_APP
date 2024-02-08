package com.backend.car_app.Service;

import com.backend.car_app.models.Client;
import com.backend.car_app.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientrepo;

    //fonction permettant de d'ajouter un client
    public Client createclient( String name,
     String surname,
     String password,
      String email,
      String username,
     Long tel){
        Client clt=new Client();
        clt.setName(name);
        clt.setSurname(surname);
        clt.setPassword(password);
        clt.setEmail(email);
        clt.setUsername(username);
        clt.setTel(tel);
        clientrepo.save(clt);
        return clt;
    }
    //fonction permettant la connexion d'un client
    public Client loginUser(String email,String password){
        Client utilisateur= clientrepo.findByEmail(email);
        if (utilisateur!= null && utilisateur.getEmail().equals(email) && utilisateur.getPassword().equals(password)){
            return utilisateur;
        }
        else {
            return null;
        }
    }

}
