package com.olsh4u.demorestfulapp.repository;

import com.olsh4u.demorestfulapp.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
