package infnet.edu.petfriends_cliente_service.application;

import infnet.edu.petfriends_cliente_service.domain.model.Cliente;
import infnet.edu.petfriends_cliente_service.domain.vo.Endereco;
import infnet.edu.petfriends_cliente_service.infrastructure.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Optional<Endereco> buscarEnderecoPorClienteId(Long clienteId) {
        Optional<Cliente> cliente = clienteRepository.findById(clienteId);
        return cliente.map(Cliente::getEndereco);
    }
}
