package backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.model.User;
import backend.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK); 
	}
	
	@GetMapping("/{name}")
	public User findByName(@PathVariable final String name) {
		return userRepository.findByName(name);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<User> add(@Valid @RequestBody User user) {
		userRepository.save(user);
		return userRepository.findAll();
	}
	
}
