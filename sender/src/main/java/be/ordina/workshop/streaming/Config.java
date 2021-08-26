package be.ordina.workshop.streaming;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class Config {

    private final String baseUrl;

    public Config(@Value("${ws.trafficdata.baseUrl:}") String baseUrl) {
        this.baseUrl = baseUrl;
    }


    @Bean
    public WebClient getWebClient() {
        return WebClient.builder()
                .exchangeStrategies(ExchangeStrategies.builder()
                        .codecs(configurer -> configurer
                                .defaultCodecs()
                                .maxInMemorySize(16 * 1024 * 1024))
                        .build())
                .baseUrl(this.baseUrl)
                .build();
    }
}
