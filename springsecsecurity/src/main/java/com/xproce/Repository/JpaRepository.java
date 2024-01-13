package com.xproce.Repository;
import com.xproce.entities.Customer;
public interface JpaRepository<T, T1> {

    Customer findByEmail(String email);
}
