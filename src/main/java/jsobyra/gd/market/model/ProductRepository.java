package jsobyra.gd.market.model;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductRepository {
    ResponseEntity<List<Item>> getAllProducts();
}
