package magix;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;

@Disabled
public class MagixTest {

    private static Magix MAGIX;

    @BeforeAll
    public static void beforeAll(){
        Client client = ResteasyClientBuilder.newClient();

        MAGIX = new Magix("http://localhost:8080", client);

        MAGIX.connect();
    }

    @Test
    @Disabled
    public void testBroadcast(){
        MAGIX.broadcast(Message.builder()
                .setId(System.currentTimeMillis())
                .build());
    }

    @AfterEach
    public void afterEach() throws Exception {
        Thread.sleep(1000);
    }


}