package com.adamdyer.Runescape.App.repository;

import com.adamdyer.Runescape.App.domain.Levels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelsRepository extends JpaRepository<Levels, Integer> {
}
