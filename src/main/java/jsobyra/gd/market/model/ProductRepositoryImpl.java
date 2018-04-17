package jsobyra.gd.market.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public ResponseEntity<List<Item>> getAllProducts() {
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }
}
