package jsobyra.gd.market.model;

import org.springframework.http.ResponseEntity;

public interface UserRepository {
    ResponseEntity<User> createUserIfNotExists(String email, String password);
    ResponseEntity<Integer> loginUser(String email, String password);
}
