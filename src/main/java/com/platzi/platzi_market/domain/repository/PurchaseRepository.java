package com.platzi.platzi_market.domain.repository;

import java.util.List;
import java.util.Optional;

import com.platzi.platzi_market.domain.Purchase;

public interface PurchaseRepository {
    List<Purchase> getAll();

    // Lo encerramos dentor de un optional ya que puede haber clientes que no tengan compras
    Optional<List<Purchase>> getByClient(String clientId);

    Purchase save(Purchase purchase);
}
