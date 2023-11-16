package com.vitorluz.dslist.repositories;

import com.vitorluz.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
