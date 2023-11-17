package com.vitorluz.dslist.repositories;

import com.vitorluz.dslist.entities.Game;
import com.vitorluz.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
