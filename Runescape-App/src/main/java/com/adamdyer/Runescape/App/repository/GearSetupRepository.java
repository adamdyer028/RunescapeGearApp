package com.adamdyer.Runescape.App.repository;

import com.adamdyer.Runescape.App.domain.GearSetup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GearSetupRepository extends JpaRepository<GearSetup, Integer> {

}
