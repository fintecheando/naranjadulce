package core.repository.interfaces;

import java.util.List;

import core.domain.Customer;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;

/**
 * The Customer Repository Interface
 */
//@Repository
public interface CustomerRepository extends HibernateRepository<Customer, String>, CustomCustomerRepository {

	Customer findOne(String customerId);

	List<Customer> findAll();
}
