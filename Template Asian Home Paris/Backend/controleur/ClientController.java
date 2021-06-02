package controleur;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import objects.Client;
import service.ClientService;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/getUserDetails")
    public Client getExample(@RequestHeader() String name) {
        return new Client (name,"frederic@gmail.com","0614297808");
    }

    @PostMapping ("/createUser")
    public String saveUser(@RequestBody Client client) throws ExecutionException, InterruptedException {

        return clientService.saveClient(client);
    }

    @PutMapping("/updateUser")
    public String putExample(@RequestBody Client client) {

        return "Update user" + client.getName();
    }

    @DeleteMapping("/deleteUser")
    public String deleteExample(@RequestHeader String name) {

        return "Deleted user"+name;
    }
}
