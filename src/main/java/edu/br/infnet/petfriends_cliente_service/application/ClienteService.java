package edu.br.infnet.petfriends_cliente_service.application;

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

    /**
     * Busca um cliente por ID.
     * @param clienteId ID do cliente a ser buscado.
     * @return Optional contendo o cliente, se encontrado.
     */
    public Optional<Cliente> buscarClientePorId(Long clienteId) {
        return clienteRepository.findById(clienteId);
    }

    /**
     * Busca o endereço de um cliente por ID.
     * @param clienteId ID do cliente cujo endereço será buscado.
     * @return Optional contendo o endereço, se encontrado.
     */
    public Optional<Endereco> buscarEnderecoPorClienteId(Long clienteId) {
        Optional<Cliente> cliente = buscarClientePorId(clienteId);

        if (cliente.isPresent()) {
            Endereco endereco = cliente.get().getEndereco();
            if (endereco != null) {
                System.out.println("Endereço encontrado: " + endereco);
                return Optional.of(endereco);
            } else {
                System.out.println("Endereço é nulo para o cliente ID: " + clienteId);
            }
        } else {
            System.out.println("Cliente não encontrado com o ID: " + clienteId);
        }

        return Optional.empty();
    }
}
