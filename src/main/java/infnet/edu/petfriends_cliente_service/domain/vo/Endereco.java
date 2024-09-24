package infnet.edu.petfriends_cliente_service.domain.vo;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    @NotEmpty(message = "A rua não pode estar vazia")
    private String rua;

    @NotEmpty(message = "A cidade não pode estar vazia")
    private String cidade;

    @NotEmpty(message = "O estado não pode estar vazio")
    private String estado;

    @NotEmpty(message = "O CEP não pode estar vazio")
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "O CEP deve estar no formato 00000-000")
    private String cep;
}
