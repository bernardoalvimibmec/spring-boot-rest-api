import java.util.UUID;

public record TaskId(UUID id) {
    public TaskId {
        Assert.notNull(id, message:"id must not be null");
    }

    public TaskId() {
        this(UUID.randomUUID());
    }
}
