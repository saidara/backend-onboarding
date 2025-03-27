package zealthy.backend_flow.controller;

import zealthy.backend_flow.model.User;
import zealthy.backend_flow.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        try{
            User savedUser = userService.registerUser(user);
            return ResponseEntity.ok(savedUser);
        } catch(Exception e){
            return ResponseEntity.status(500).body("Error:" +e.getMessage());
        }
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/check")
    public ResponseEntity<?> checkUser(@RequestParam String email) {
        boolean exists = userService.isUserExists(email);
        return ResponseEntity.ok().body(Map.of("exists", exists));
    }

}


