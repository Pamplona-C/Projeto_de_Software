public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String username, String email) {
        User newUser = new User(UUID.randomUUID(), username, email, new ArrayList<>());
        userRepository.save(newUser);
        return newUser;
    }
}
