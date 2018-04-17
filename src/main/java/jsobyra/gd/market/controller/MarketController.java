package jsobyra.gd.market.controller;

import jsobyra.gd.market.model.Item;
import jsobyra.gd.market.model.ProductRepository;
import jsobyra.gd.market.model.User;
import jsobyra.gd.market.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MarketController {
    private ProductRepository productRepository;
    private UserRepository userRepository;

    @Autowired
    public MarketController(UserRepository userRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public ResponseEntity<User> registerUser(@RequestParam(value = "email") String email,
                                             @RequestParam(value = "password") String password) {
        return userRepository.createUserIfNotExists(email, password);
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public ResponseEntity<Integer> loginUser(@RequestParam(value = "email") String email,
                                             @RequestParam(value = "password") String password) {
        return userRepository.loginUser(email, password);
    }

    @RequestMapping(path = "/store/products", method = RequestMethod.GET)
    public ResponseEntity<List<Item>> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
