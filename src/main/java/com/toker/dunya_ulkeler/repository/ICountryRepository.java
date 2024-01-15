package com.toker.dunya_ulkeler.repository;

import com.toker.dunya_ulkeler.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends JpaRepository<Country,String> {
}
