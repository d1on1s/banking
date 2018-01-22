package online.denseleznev.banking.dao;

import java.util.List;

import online.denseleznev.banking.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

