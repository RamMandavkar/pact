package de.kreuzwerker.cdc.userservice;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import au.com.dius.pact.model.ProviderState;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId) {
        return userService.findUser(userId);
    }
    
    @PostMapping("/tasks/pactStateChange")
    public ResponseEntity<?> stateChange(@RequestBody ProviderState state) {
   	   return ResponseEntity.ok().build();
    }

}
