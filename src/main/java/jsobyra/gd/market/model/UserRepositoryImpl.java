package jsobyra.gd.market.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public ResponseEntity<User> createUserIfNotExists(String email, String password) {
        return new ResponseEntity<>(new User(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Integer> loginUser(String email, String password) {
        return new ResponseEntity<>(4, HttpStatus.OK);
    }
}
