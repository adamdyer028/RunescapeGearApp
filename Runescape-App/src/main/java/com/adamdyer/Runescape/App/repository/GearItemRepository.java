package com.adamdyer.Runescape.App.repository;

import com.adamdyer.Runescape.App.domain.GearItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GearItemRepository extends JpaRepository<GearItem, Integer> {
}
