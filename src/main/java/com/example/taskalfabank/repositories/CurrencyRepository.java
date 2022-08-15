package com.example.taskalfabank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
