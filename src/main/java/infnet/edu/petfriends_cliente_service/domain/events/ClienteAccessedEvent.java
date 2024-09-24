package infnet.edu.petfriends_cliente_service.domain.events;

import lombok.Getter;

import java.util.Objects;

@Getter
public class ClienteAccessedEvent {
    private final Long clienteId;
    private final String eventType;

    public ClienteAccessedEvent(Long clienteId, String eventType) {
        this.clienteId = clienteId;
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "ClienteAccessedEvent{" +
                "clienteId=" + clienteId +
                ", eventType='" + eventType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteAccessedEvent that = (ClienteAccessedEvent) o;
        return Objects.equals(clienteId, that.clienteId) &&
                Objects.equals(eventType, that.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clienteId, eventType);
    }
}
