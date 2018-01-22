package online.denseleznev.banking.dao;

import java.util.List;

import online.denseleznev.banking.domain.Recipient;
import org.springframework.data.repository.CrudRepository;

public interface RecipientDao extends CrudRepository<Recipient, Long> {
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
