package magix;

public class Message<T> {
    public long id;
    public String origin;
    public String format;
    public long parentId;
    public String target;
    public String user;
    public T payload;


    public Message<T> withId(long id) {
        this.id = id;
        return this;
    }

    public Message<T> withParentId(long parent) {
        this.parentId = parent;
        return this;
    }

    public Message<T> withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public Message<T> withFormat(String format) {
        this.format = format;
        return this;
    }

    public Message<T> withTarget(String target) {
        this.target = target;
        return this;
    }

    public Message<T> withUser(String user) {
        this.user = user;
        return this;
    }

    public Message<T> withPayload(T payload) {
        this.payload = payload;
        return this;
    }
}
