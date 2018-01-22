package online.denseleznev.banking.dao;

import java.util.List;

import online.denseleznev.banking.domain.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
