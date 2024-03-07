import java.util.UUID;
import java.util.List;

public class User {
    private final UUID userId;
    private final String username;
    private final String email;
    private final List<Post> posts;

    public User(UUID userId, String username, String email, List<Post> posts) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.posts = posts;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Post> getPosts() {
        return posts;
    }
}
