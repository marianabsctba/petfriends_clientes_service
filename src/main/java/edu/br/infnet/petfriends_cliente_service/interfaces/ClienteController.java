package edu.br.infnet.petfriends_cliente_service.interfaces;


import edu.br.infnet.petfriends_cliente_service.application.ClienteService;
import infnet.edu.petfriends_cliente_service.domain.vo.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}/endereco")
    public ResponseEntity<Endereco> getEnderecoCliente(@PathVariable Long id) {
        return clienteService.buscarEnderecoPorClienteId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
