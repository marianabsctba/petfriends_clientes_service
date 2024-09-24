package infnet.edu.petfriends_cliente_service;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class PetfriendsClientesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetfriendsClientesApplication.class, args);
    }
}
