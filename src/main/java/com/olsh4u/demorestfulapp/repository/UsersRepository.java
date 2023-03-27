package com.olsh4u.demorestfulapp.repository;

import com.olsh4u.demorestfulapp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    List<Users> findAllByName(String name);

    @Query("SELECT u FROM Users u WHERE u.email LIKE '%@gmail.com'")
    List<Users> findWhereEmailsGmail();


}
