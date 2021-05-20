package com.alexpaulo100.citiesapi.countries.repository;

import com.alexpaulo100.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
