package com.backend.car_app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.car_app.models.Client;
import com.backend.car_app.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client createClient(Client client){
        
        return clientRepository.save(client);

    }

    public Client getClient(Long id){
        return clientRepository.findById(id).get();
    }

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }

    public Client updateClient(Long id,Client client){
        Client client1 = clientRepository.findById(id).get();
        if (client.getName() != null) {
            client1.setName(client.getName());
        }
        if (client.getSurname() != null) {
            client1.setSurname(client.getSurname());
        }
        if (client.getPassword() != null) {
            client1.setPassword(client.getPassword());
        }
        if (client.getEmail() != null) {
            client1.setEmail(client.getEmail());
        }
        if (client.getUsername() != null) {
            client1.setUsername(client.getUsername());
        }
        if (client.getTel() != null) {
            client1.setTel(client.getTel());
        }
        

        clientRepository.save(client1);

        return client1;
    }
}
