package com.backend.car_app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.backend.car_app.Service.ClientService;
import com.backend.car_app.models.Client;
// import com.backend.car_app.models.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/client/")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/")
    public ResponseEntity<Client> createClient(@RequestBody Client user) {
        Client client = clientService.createClient(user);
        return ResponseEntity.ok(client);
    }

    @GetMapping("/")
    public ResponseEntity<List<Client>> listClients() {
        List<Client> clients = clientService.getClients();
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable Long id) {
        Client client = clientService.getClient(id);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.ok("Client Deleted");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id,@RequestBody Client user){
        Client updated_client = clientService.updateClient(id, user);
        return ResponseEntity.ok(updated_client);
    }
}
