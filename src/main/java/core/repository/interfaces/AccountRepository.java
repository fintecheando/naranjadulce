package core.repository.interfaces;

import java.util.List;

import core.domain.Account;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;

/**
 * The Account Repository Interface
 */
//@Repository
public interface AccountRepository extends HibernateRepository<Account, String>, CustomAccountRepository {

	List<Account> findAll();
}
