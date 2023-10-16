package com.green.greenHibernate.repository;

import lombok.NonNull;
import com.green.greenHibernate.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Page<User> findAll(@NonNull Pageable pageable);
}
