package infnet.edu.petfriends_cliente_service.domain.model;

import infnet.edu.petfriends_cliente_service.domain.vo.Endereco;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "O nome não pode estar vazio")
    private String nome;

    @NotEmpty(message = "O email não pode estar vazio")
    @Email(message = "Formato de email inválido")
    private String email;

    @NotEmpty(message = "O telefone não pode estar vazio")
    private String telefone;

    @Embedded
    @NotNull(message = "O endereço não pode ser nulo")
    private Endereco endereco;  // Value Object
}
