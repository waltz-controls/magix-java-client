package magix;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import java.util.concurrent.ExecutionException;

@Disabled
public class SseMagixClientTest {

    private static SseMagixClient SseMAGIXClient;

    @BeforeAll
    public static void beforeAll(){
        Client client = ResteasyClientBuilder.newClient();

        SseMAGIXClient = new SseMagixClient("http://192.168.0.103", client);

        SseMAGIXClient.connect();
    }

    @Disabled
    @Test
    public void testBroadcast() throws ExecutionException, InterruptedException {
        SseMAGIXClient.broadcast(Message.builder()
                .setId(System.currentTimeMillis())
                .build()).get();
    }


}