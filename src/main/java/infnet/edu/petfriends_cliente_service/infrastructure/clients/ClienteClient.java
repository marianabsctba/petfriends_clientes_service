package infnet.edu.petfriends_cliente_service.infrastructure.clients;


import infnet.edu.petfriends_cliente_service.domain.vo.Endereco;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClienteClient {

    private final RestTemplate restTemplate;

    public ClienteClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Endereco buscarEndereco(Long clienteId) {
        String url = "http://localhost:8081/api/clientes/" + clienteId + "/endereco";
        return restTemplate.getForObject(url, Endereco.class);
    }
}
