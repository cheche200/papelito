package com.juanicheche.papelito.repository;

import com.juanicheche.papelito.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
