import java.util.UUID;
import java.util.Date;

public class Post {
    private final UUID postId;
    private final String title;
    private final String content;
    private final User author;
    private final Date datePosted;

    public Post(UUID postId, String title, String content, User author, Date datePosted) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.datePosted = datePosted;
    }

    public UUID getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Date getDatePosted() {
        return datePosted;
    }
}
