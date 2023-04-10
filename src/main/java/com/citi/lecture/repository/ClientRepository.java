package com.citi.lecture.repository;

import com.citi.lecture.entity.Client;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ClientRepository extends PagingAndSortingRepository<Client, Integer> {

    @Query("select * from users where name = :name")
    List<Client> findClientByName(String name);

    @Modifying
    @Query("update users set email = :email where name = :name")
    Boolean updateEmailByName(String name, String email);

    @Modifying
    @Query("delete from users where name = :name")
    Boolean deleteClientByName(String name);
}
