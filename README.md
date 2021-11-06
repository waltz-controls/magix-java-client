# magix-java-client
Java Client for Magix http/sse

# Usage

```java
        ResteasyJackson2Provider jacksonProvider = new ResteasyJackson2Provider();

        Client client = ResteasyClientBuilder.newClient().register(jacksonProvider);

        var magix = new SseMagixClient("http://" + System.getProperty("MAGIX_HOST", "localhost:8080"), client);
```
