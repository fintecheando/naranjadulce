package core.repository.interfaces;

import java.util.List;

import core.domain.Transaction;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;

/**
 * The Transaction Repository Interface
 */
//@Repository
public interface TransactionRepository extends HibernateRepository<Transaction, String>, CustomTransactionRepository {

	List<Transaction> findAll();
}
