@RestController
@RequestMapping("/api/users")
public class UserController {
    private final CreateUserUseCase createUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserRequest request) {
        User newUser = createUserUseCase.execute(request.getUsername(), request.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }
}
