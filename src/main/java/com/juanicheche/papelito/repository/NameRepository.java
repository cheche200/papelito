package com.juanicheche.papelito.repository;

import com.juanicheche.papelito.domain.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {
}
