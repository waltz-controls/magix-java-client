package magix;

import java.util.ArrayList;

public class Message <T> {
    public long id;
    public long parent;
    public String origin;
    public String target;
    public String user;
    public String action;
    public Iterable<T> payload;

    public static <T> Message.Builder<T> builder() {
        return new Builder<>() {
            private Message<T> message = new Message<>();

            {
                message.payload = new ArrayList<>();
            }

            @Override
            public Message<T> build() {
                return message;
            }

            @Override
            public Builder<T> setId(long id) {
                message.id = id;
                return this;
            }

            @Override
            public Builder<T> setParent(long parent) {
                message.parent = parent;
                return this;
            }

            @Override
            public Builder<T> setOrigin(String origin) {
                message.origin = origin;
                return this;
            }

            @Override
            public Builder<T> setTarget(String target) {
                message.target = target;
                return this;
            }

            @Override
            public Builder<T> setUser(String user) {
                message.user = user;
                return this;
            }

            @Override
            public Builder<T> setAction(String action) {
                message.action = action;
                return this;
            }

            @Override
            public Builder<T> addPayload(T payload) {
                ((ArrayList<T>) message.payload).add(payload);
                return this;
            }
        };
    }

    public static interface Builder<T> {
        Message<T> build();

        Builder<T> setId(long id);

        Builder<T> setParent(long parent);

        Builder<T> setOrigin(String origin);

        Builder<T> setTarget(String target);

        Builder<T> setUser(String user);

        Builder<T> setAction(String action);

        Builder<T> addPayload(T payload);
    }
}
