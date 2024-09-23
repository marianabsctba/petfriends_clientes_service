package infnet.edu.petfriends_cliente_service.infrastructure.repository;

import infnet.edu.petfriends_cliente_service.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
