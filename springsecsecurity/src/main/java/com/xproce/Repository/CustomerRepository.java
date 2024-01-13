package com.xproce.Repository;

import com.xproce.entities.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    Customer findByEmail(String email);
}
